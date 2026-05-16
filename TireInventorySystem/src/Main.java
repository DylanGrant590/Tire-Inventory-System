import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryDB inventory = new InventoryDB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Tire Inventory (DB) ---");
            System.out.println("1. Add Tire");
            System.out.println("2. View Tires");
            System.out.println("3. Search Brand");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Size: ");
                    String size = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = scanner.nextInt();

                    inventory.addTire(new Tire(brand, size, price, qty));
                    break;

                case 2:
                    List<Tire> tires = inventory.getAllTires();
                    for (Tire t : tires) {
                        System.out.println(t);
                    }
                    break;

                case 3:
                    System.out.print("Enter brand: ");
                    String search = scanner.nextLine();

                    List<Tire> results = inventory.searchByBrand(search);
                    for (Tire t : results) {
                        System.out.println(t);
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid option");
                    scanner.close();
            }
        }
    }
}