package Generics;
import java.util.List;
abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;
    Course(T type) { this.type = type; }
}

class UniversityUtil {
    public static void printCourses(List<? extends CourseType> list) {
        list.forEach(c -> System.out.println(c.getClass().getSimpleName()));
    }
}

class UniCourseManagement {
    public static void main(String[] args) {
        List<CourseType> list = List.of(new ExamCourse(), new ResearchCourse());
        UniversityUtil.printCourses(list);
    }
}
