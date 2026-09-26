import java.util.ArrayList;
import java.util.Scanner;
public class Inventory{
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(){
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        System.out.println("Welcome to product source!!");
        System.out.println("---Add the product info---");
        System.out.println("Enter the product name:");
        p.name=sc.next();
        System.out.println("Enter the availability status:");
        p.status=sc.next();
        System.out.println("Enter the quantity:");
        p.quantity=sc.nextFloat();
        System.out.println("Enter the unit:");
        p.unit=sc.next();
        System.out.println("Enter the price:");
        p.price=sc.nextFloat();
        System.out.println("Enter the minimum stock:");
        p.minimumStock=sc.nextFloat();
        products.add(p);
    }
    void availability(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to product status!!");
        System.out.println("---Check the product status---");
        System.out.println("Enter the product name:");
        String name=sc.next();
        for (Product p:products){
            if (p.name.equals(name)){
                System.out.println("Availability: "+p.status);
                System.out.println("Quantity: "+p.quantity+" "+p.unit);
            }
            else{
                System.out.println("Product not found!!");
            }
        }
    }
    void shortage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to shortage panel!!");
        System.out.println("---Shortage products---");
        for (Product p:products){
            if (p.quantity<=p.minimumStock){
                System.out.println(" "+p.name);
                System.out.println(" "+p.quantity+" "+p.unit);
            }
        }
    }
    void report(){
        
    }
    void product(){

    }
}