package db;

import MiniProject.Student;
import MiniProject.Result;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "youruser";
    private static final String DB_PASS = "yourpassword";

    // in-memory collections
    private final List<Student> students = new ArrayList<>();
    private final List<Result> results = new ArrayList<>();

    public DatabaseManager() {
        // load initial data into collections
        loadStudentsFromDB();
        loadResultsFromDB();
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
    }

    // ---------- Student CRUD ----------
    public boolean addStudent(Student s) {
        String sql = "INSERT INTO students (id, name, course) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                students.add(s);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("addStudent error: " + e.getMessage());
        }
        return false;
    }

    public Student getStudent(int id) {
        // check in-memory first
        for (Student s : students) if (s.getId() == id) return s;
        // otherwise try DB
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("course"));
                students.add(s);
                return s;
            }
        } catch (SQLException e) {
            System.err.println("getStudent error: " + e.getMessage());
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public boolean updateStudent(Student s) {
        String sql = "UPDATE students SET name = ?, course = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setInt(3, s.getId());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                // update in-memory
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getId() == s.getId()) {
                        students.set(i, s);
                        break;
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            System.err.println("updateStudent error: " + e.getMessage());
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                students.removeIf(s -> s.getId() == id);
                results.removeIf(r -> r.getStudentId() == id);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("deleteStudent error: " + e.getMessage());
        }
        return false;
    }

    // ---------- Result CRUD ----------
    public boolean addOrUpdateResult(Result r) {
        // Try update first
        String update = "UPDATE results SET marks = ?, grade = ? WHERE studentId = ?";
        String insert = "INSERT INTO results (studentId, marks, grade) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement psUp = conn.prepareStatement(update)) {
            psUp.setInt(1, r.getMarks());
            psUp.setString(2, r.getGrade());
            psUp.setInt(3, r.getStudentId());
            int rows = psUp.executeUpdate();
            if (rows > 0) {
                // update in-memory
                results.removeIf(x -> x.getStudentId() == r.getStudentId());
                results.add(r);
                return true;
            }
            // insert
            try (PreparedStatement psIn = conn.prepareStatement(insert)) {
                psIn.setInt(1, r.getStudentId());
                psIn.setInt(2, r.getMarks());
                psIn.setString(3, r.getGrade());
                int ins = psIn.executeUpdate();
                if (ins > 0) {
                    results.add(r);
                    return true;
                }
            }
        } catch (SQLException e) {
            System.err.println("addOrUpdateResult error: " + e.getMessage());
        }
        return false;
    }

    public Result getResult(int studentId) {
        for (Result r : results) if (r.getStudentId() == studentId) return r;
        String sql = "SELECT * FROM results WHERE studentId = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Result r = new Result(rs.getInt("studentId"), rs.getInt("marks"), rs.getString("grade"));
                results.add(r);
                return r;
            }
        } catch (SQLException e) {
            System.err.println("getResult error: " + e.getMessage());
        }
        return null;
    }

    public List<Result> getAllResults() {
        return new ArrayList<>(results);
    }

    // ---------- Load from DB ----------
    private void loadStudentsFromDB() {
        students.clear();
        String sql = "SELECT * FROM students";
        try (Connection conn = getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("course")));
            }
        } catch (SQLException e) {
            System.err.println("loadStudentsFromDB error: " + e.getMessage());
        }
    }

    private void loadResultsFromDB() {
        results.clear();
        String sql = "SELECT * FROM results";
        try (Connection conn = getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                results.add(new Result(rs.getInt("studentId"), rs.getInt("marks"), rs.getString("grade")));
            }
        } catch (SQLException e) {
            System.err.println("loadResultsFromDB error: " + e.getMessage());
        }
    }

}
