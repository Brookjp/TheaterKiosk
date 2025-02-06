import java.util.Scanner;

public class TheaterEntry {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            System.out.println("Congratulations! You get a wristband.");
        } else {
            System.out.println("Sorry, you need to be 21 or older to get a wristband.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}