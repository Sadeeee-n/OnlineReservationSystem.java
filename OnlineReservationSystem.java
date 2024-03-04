import java.util.Scanner;

// Define a class for the Online Reservation System
public class OnlineReservationSystem 
{
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isLoggedIn = false;
    private static String username = "username";
    private static String password = "password";

    // Main method to start the application
    public static void main(String[] args) 
    {
        while (true) 
        {
            // Display menu options
            System.out.println("Welcome to the Online Reservation System");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice)
            {
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method for user login
    private static void login() 
    {
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) 
        {
            isLoggedIn = true;
            System.out.println("Your Login successful!");
            reservationSystem();
        } else 
        {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    // Method for reservation system
    private static void reservationSystem() 
    {
        if (!isLoggedIn) 
        {
            System.out.println("You need to login first.");
            return;
        }

        System.out.println("Welcome to the Reservation System");
        // Implement reservation logic here
        // This is just a placeholder
        System.out.println("Reservation logic will be implemented here.");
    }

    // Method for cancellation
    private static void cancellation() 
    {
        if (!isLoggedIn) 
        {
            System.out.println("You need to login first.");
            return;
        }

        System.out.println("Welcome to Cancellation System");
        // Implement cancellation logic here
        // This is just a placeholder
        System.out.println("Cancellation logic will be implemented here.");
    }
}
