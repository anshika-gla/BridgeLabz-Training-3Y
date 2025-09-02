import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double total = 0;
            StringBuilder items = new StringBuilder();
            System.out.println("\n--- New Customer ---");
            int n;
            do {
                System.out.print("Enter number of items you want to add: ");
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("You must add at least 1 product!");
                }
            } while (n <= 0);
            System.out.println("\n--- Product Menu ---");
            System.out.println("1. Laptop - 40000");
            System.out.println("2. Mobile - 20000");
            System.out.println("3. Headphones - 2000");
            System.out.println("4. Keyboard - 1500");
            System.out.println("5. Mouse - 800");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter product number (1-5) for item " + (i + 1) + ": ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        items.append("Laptop\n");
                        total += 40000;
                        System.out.println("Added Laptop - Rs.40000");
                        break;
                    case 2:
                        items.append("Mobile\n");
                        total += 20000;
                        System.out.println("Added Mobile - Rs.20000");
                        break;
                    case 3:
                        items.append("Headphones\n");
                        total += 2000;
                        System.out.println("Added Headphones - Rs.2000");
                        break;
                    case 4:
                        items.append("Keyboard\n");
                        total += 1500;
                        System.out.println("Added Keyboard - Rs.1500");
                        break;
                    case 5:
                        items.append("Mouse\n");
                        total += 800;
                        System.out.println("Added Mouse - Rs.800");
                        break;
                    default:
                        System.out.println("Invalid choice! Skipped.");
                }
            }
            if (total > 5000) {
                double discount = total * 0.10;
                total -= discount;
                System.out.println("\nDiscount applied: Rs." + discount);
            }
            System.out.println("\n--- Final Bill ---");
            System.out.println(items);
            System.out.println("Total Amount: Rs." + total);
            System.out.print("\nServe next customer? (y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                System.out.println("Shop closed. Thank you!");
                break;
            }
        }

        sc.close();
    }
}
