package Generics;
class Util {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }
}

class CompareTwoValues {
    public static void main(String[] args) {
        System.out.println(Util.isEqual(10, 10));
        System.out.println(Util.isEqual("Hi", "Hello"));
    }
}
