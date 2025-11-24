package Wrapper;
public class SensorDataLogger {
    public static void log(double temp) { 
        Double wrapperTemp = temp; 
        System.out.println("Stored: " + wrapperTemp);
    }

    public static void log(Double temp) { 
        double p = temp; 
        System.out.println("Stored: " + p);
    }

    public static void main(String[] args) {
        log(36.5);
        log(Double.valueOf(28.9));
    }
}
