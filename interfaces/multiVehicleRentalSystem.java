package interfaces;
interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car rented.");
    }
    public void returnVehicle() {
        System.out.println("Car returned.");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented.");
    }
    public void returnVehicle() {
        System.out.println("Bike returned.");
    }
}

public class multiVehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.rent();
        v1.returnVehicle();
    }
}
