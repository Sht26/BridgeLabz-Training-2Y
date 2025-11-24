

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void display() {
        System.out.printf("%s (%s) - Price: %.2f", name, productId, price);
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice()*0.10; }
    @Override public double calculateTax() { return getPrice()*0.18; }
    @Override public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice()*0.20; }
    @Override public double calculateTax() { return getPrice()*0.05; }
    @Override public String getTaxDetails() { return "GST 5%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return 0; }
}

public class EcommerceDemo {
    public static void printFinalPrice(Product p) {
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;
        p.display();
        System.out.printf(", Tax: %.2f, Discount: %.2f, Final: %.2f\n", tax, discount, finalPrice);
    }

    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Electronics("E100","Smartphone",25000),
            new Clothing("C200","Jeans",2000),
            new Groceries("G300","Rice 5kg",400)
        };

        for (Product p : products) printFinalPrice(p);
    }
}
