package oops8;
import java.util.Scanner;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal[] animals = new Animal[3];

        System.out.print("Enter Dog's name: ");
        String dogName = sc.nextLine();
        System.out.print("Enter Dog's age: ");
        int dogAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Cat's name: ");
        String catName = sc.nextLine();
        System.out.print("Enter Cat's age: ");
        int catAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bird's name: ");
        String birdName = sc.nextLine();
        System.out.print("Enter Bird's age: ");
        int birdAge = sc.nextInt();

        animals[0] = new Dog(dogName, dogAge);
        animals[1] = new Cat(catName, catAge);
        animals[2] = new Bird(birdName, birdAge);

        for (Animal a : animals) {
            a.makeSound();
        }

        sc.close();
    }
}
