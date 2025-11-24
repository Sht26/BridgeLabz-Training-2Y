package map;
import java.util.*;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        HashMap<String,Integer> stock = new HashMap<>();

        stock.put("Laptop",10);
        stock.put("Mouse",30);

        stock.put("Laptop", stock.get("Laptop") - 3);
        if(stock.get("Laptop") <= 0) stock.put("Laptop",0);

        stock.put("Mouse", stock.get("Mouse") + 20);

        String prod = "Laptop";
        System.out.println(stock.getOrDefault(prod,0));

        System.out.println("Out of stock:");
        for(String p : stock.keySet()){
            if(stock.get(p)==0) System.out.println(p);
        }
    }
}
