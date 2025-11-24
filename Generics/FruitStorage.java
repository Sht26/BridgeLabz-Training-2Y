package Generics;
import java.util.ArrayList;
class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<>();
    void add(T fruit) {
        list.add(fruit);
    }

    void display() {
        list.forEach(f -> System.out.println(f.getClass().getSimpleName()));
    }
}

class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Fruit> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.add(new Mango());
        fb.display();
    }
}
