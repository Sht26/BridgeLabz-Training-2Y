package interfaces;
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned ON");
    }
    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV turned ON");
    }
    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}

public class smartDeviceControl {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice tv = new TV();
        light.turnOn();
        tv.turnOff();
    }
}

