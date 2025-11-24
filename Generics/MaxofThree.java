package Generics;
class MaxUtil {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
}

class MaxofThree {
    public static void main(String[] args) {
        System.out.println(MaxUtil.maximum(10, 25, 15));
        System.out.println(MaxUtil.maximum("Apple", "Dog", "Cat"));
    }
}
