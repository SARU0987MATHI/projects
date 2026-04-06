import java.util.Scanner;

public class MovieBillingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, tickets;
        String movie = "";
        int price = 0;

        System.out.println("Select Movie:");
        System.out.println("1. Leo - ₹150");
        System.out.println("2. Jailer - ₹200");
        System.out.println("3. Vikram - ₹180");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                movie = "Leo";
                price = 150;
                break;
            case 2:
                movie = "Jailer";
                price = 200;
                break;
            case 3:
                movie = "Vikram";
                price = 180;
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        System.out.print("Enter number of tickets: ");
        tickets = sc.nextInt();

        int subtotal = tickets * price;
        double gst = subtotal * 0.18;
        double total = subtotal + gst;

        System.out.println("\n----- BILL -----");
        System.out.println("Movie: " + movie);
        System.out.println("Tickets: " + tickets);
        System.out.println("Price per ticket: ₹" + price);
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Total Amount: ₹" + total);
    }
}