package app;

import db.DatabaseManager;
import MiniProject.Student;
import MiniProject.Result;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final DatabaseManager db = new DatabaseManager();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = readInt("Choose an option: ");
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> addOrUpdateResult();
                case 7 -> viewResult();
                case 8 -> { System.out.println("Bye!"); return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Student Result Management ---");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student By ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Add/Update Result");
        System.out.println("7. View Result");
        System.out.println("8. Exit");
    }

    private static void addStudent() {
        int id = readInt("Enter ID: ");
        String name = readLine("Enter name: ");
        String course = readLine("Enter course: ");
        Student s = new Student(id, name, course);
        if (db.addStudent(s)) System.out.println("Student added.");
        else System.out.println("Failed to add. Maybe duplicate ID.");
    }

    private static void viewAllStudents() {
        List<Student> list = db.getAllStudents();
        if (list.isEmpty()) System.out.println("No students found.");
        else list.forEach(System.out::println);
    }

    private static void searchStudent() {
        int id = readInt("Enter ID to search: ");
        Student s = db.getStudent(id);
        System.out.println(s == null ? "Not found." : s);
    }

    private static void updateStudent() {
        int id = readInt("Enter ID to update: ");
        Student existing = db.getStudent(id);
        if (existing == null) {
            System.out.println("Student not found.");
            return;
        }
        String name = readLine("Enter new name (leave blank to keep): ");
        String course = readLine("Enter new course (leave blank to keep): ");
        if (!name.isBlank()) existing.setName(name);
        if (!course.isBlank()) existing.setCourse(course);
        if (db.updateStudent(existing)) System.out.println("Updated.");
        else System.out.println("Update failed.");
    }

    private static void deleteStudent() {
        int id = readInt("Enter ID to delete: ");
        if (db.deleteStudent(id)) System.out.println("Deleted.");
        else System.out.println("Delete failed or not found.");
    }

    private static void addOrUpdateResult() {
        int id = readInt("Enter student ID for result: ");
        Student s = db.getStudent(id);
        if (s == null) {
            System.out.println("Student not found. Add student first.");
            return;
        }
        int marks = readInt("Enter marks (0-100): ");
        String grade = calcGrade(marks);
        Result r = new Result(id, marks, grade);
        if (db.addOrUpdateResult(r)) System.out.println("Result saved: " + r);
        else System.out.println("Failed to save result.");
    }

    private static void viewResult() {
        int id = readInt("Enter student ID to view result: ");
        Result r = db.getResult(id);
        if (r == null) System.out.println("No result found for student " + id);
        else System.out.println(r);
    }

    // helpers
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try { return Integer.parseInt(line.trim()); }
            catch (NumberFormatException e) { System.out.println("Invalid number."); }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static String calcGrade(int marks) {
        if (marks >= 85) return "A";
        if (marks >= 70) return "B";
        if (marks >= 50) return "C";
        return "F";
    }
}
