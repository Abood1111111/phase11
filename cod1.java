
import java.util.Scanner;
 
public class BookStoreManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        // Input book details

        System.out.print("Enter the book title: ");

        String bookTitle = scanner.nextLine();
 
        System.out.print("Enter the book price (in BHD): ");

        double bookPrice = scanner.nextDouble();
 
        // Calculate the final price with VAT

        double vatRate = 0.10; // 10% VAT

        double vatAmount = bookPrice * vatRate;

        double finalPrice = bookPrice + vatAmount;
 
        // Display the book details and final price

        System.out.println("\nBook Details:");

        System.out.println("Title: " + bookTitle);

        System.out.println("Price (BHD): " + bookPrice);

        System.out.println("VAT (" + (vatRate * 100) + "%): " + vatAmount);

        System.out.println("Final Price (BHD): " + finalPrice);
 
        // Close the scanner

        scanner.close();

    }

}
