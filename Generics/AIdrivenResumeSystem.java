package Generics;
import java.util.List;
abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
}

class ResumeUtil {
    public static void processAll(List<? extends JobRole> roles) {
        roles.forEach(r -> System.out.println("Processing: " + r.getClass().getSimpleName()));
    }
}

class AIdrivenResumeSystem {
    public static void main(String[] args) {
        ResumeUtil.processAll(List.of(new SoftwareEngineer(), new ProductManager()));
    }
}
