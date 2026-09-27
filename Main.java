import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Inventory inventory=new Inventory();
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO STOCKFLOW!!");
        while (true){
            System.out.println("----MENU CARD----");
            System.out.println("1.Add product");
            System.out.println("2.Product sold");
            System.out.println("3.Product availability");
            System.out.println("4.Shortage alert");
            System.out.println("5.Monthly report");
            System.out.println("6.Highest/Least sold product");
            System.out.println("7.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    inventory.addProduct();
                    break;
                case 2:
                    inventory.sellProduct();
                    break;
                case 3:
                    inventory.availability();
                    break;
                case 4:
                    inventory.shortage();
                    break;
                case 5:
                    inventory.report();
                    break;
                case 6:
                    inventory.product();
                    break;
                case 7:
                    System.out.println("Thank You for using StockFlow!!");
                    return;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}