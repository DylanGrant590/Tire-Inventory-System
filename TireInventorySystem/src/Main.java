import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InventoryDB inventory = new InventoryDB();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                try {
                    Thread.sleep(1000); // pause for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("---------------------------");
                System.out.println("***Tire Inventory System***");
                System.out.println("---------------------------");

                try {
                    Thread.sleep(2000); // pause for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("1. Add Tire");
                System.out.println("2. View Tires");
                System.out.println("3. Search Brand");
                System.out.println("4. Exit");

                System.out.print("\nPlease enter an option from the menu: ");

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
                        scanner.nextLine();

                        inventory.addTire(new Tire(brand, size, price, qty));

                        System.out.println("Tire added successfully!");
                        break;

                    case 2:

                        List<Tire> tires = inventory.getAllTires();

                        if (tires.isEmpty()) {
                            System.out.println("No tires in inventory.");
                        } else {
                            for (Tire t : tires) {
                                System.out.println(t);
                            }
                        }

                        break;

                    case 3:

                        System.out.print("Enter brand: ");
                        String search = scanner.nextLine();

                        List<Tire> results = inventory.searchByBrand(search);

                        if (results.isEmpty()) {
                            throw new IllegalArgumentException("Brand not found!");
                        }

                        for (Tire t : results) {
                            System.out.println(t);
                        }

                        break;

                    case 4:

                        System.out.println("Goodbye...");
                        scanner.close();
                        return;

                    default:

                        System.out.println("Invalid menu option!");
                }

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {

                System.out.println("Invalid input! Please try again.");
                scanner.nextLine();
            }
        }
    }
}