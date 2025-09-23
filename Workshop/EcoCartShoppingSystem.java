package oops;
abstract class Product{
	private int id;
	private String name;
	private double price;
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public abstract double getDiscountedPrice();
	public void displayProductInfo() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Discounted Price : "+getDiscountedPrice());
	}
}
class OrganicProduct extends Product{
	public OrganicProduct(int id,String name,double price) {
		super(id,name,price);
	}
	public double getDiscountedPrice() {
		return getPrice()-(getPrice()*0.10);
	}
}
class RecycledProduct extends Product{
	public RecycledProduct(int id,String name,double price) {
		super(id,name,price);
	}
	public double getDiscountedPrice() {
		return getPrice()-(getPrice()*0.05);
	}
}
class Cart{
	private Product[] products;
	private int size;
	public Cart() {
		products=new Product[10];
		size=0;
	}
	public void Capacity(){
		if(size>=products.length) {
			Product[] newProducts=new Product[products.length*2];
			for(int i=0;i<products.length;i++) {
				newProducts[i]=products[i];
			}
			products=newProducts;
		}
	}
	public void addItem(Product product) {
		Capacity();
		products[size++]=product;
		System.out.println("Added Product : "+product.getName());
	}
}
public class EcoCartShoppingSystem{
	public static void main(String[] args) {
		Product p1=new OrganicProduct(1,"apple",100);
		Product p2=new RecycledProduct(2,"Recycled item",200);
		System.out.println(p1.getName()+" discounted price "+p1.getDiscountedPrice());
		System.out.println(p2.getName()+" discounted price "+p2.getDiscountedPrice());
		
	}
}