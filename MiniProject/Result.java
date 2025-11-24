package MiniProject;

public class Result {
    private int studentId;
    private int marks;
    private String grade;

    public Result(int studentId, int marks, String grade) {
        this.studentId = studentId;
        this.marks = marks;
        this.grade = grade;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return String.format("Result{studentId=%d, marks=%d, grade='%s'}", studentId, marks, grade);
    }
}
