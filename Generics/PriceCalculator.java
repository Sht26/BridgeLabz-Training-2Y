package Generics;
import java.util.List;
abstract class Product {
    abstract double getPrice();
}

class Mobile extends Product {
    public double getPrice() { return 25000; }
}

class Laptop extends Product {
    public double getPrice() { return 55000; }
}

class PriceUtil {
    public static double calculateTotal(List<? extends Product> items) {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }
}

class PriceCalculator {
    public static void main(String[] args) {
        List<Mobile> list = List.of(new Mobile(), new Mobile());
        System.out.println(PriceUtil.calculateTotal(list));
    }
}
