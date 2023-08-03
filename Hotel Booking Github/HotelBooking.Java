import java.util.Scanner;
import java.util.Random;

class HotelBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Greet the User
        System.out.println("Hello and welcome to our Hotel!");

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for the number of nights
        System.out.print("Enter the number of nights: ");
        int numNights = scanner.nextInt();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the total cost
        int roomCost = 90;
        int totalCost = roomCost * numNights;

        // Check if the booking can be confirmed
        boolean canConfirmBooking = age >= 18;

        // Generate a shorter random numeric confirmation number
        String confirmationNumber = generateShortNumericConfirmationNumber();

        // Output the booking details and total cost
        System.out.println("Booking Details:");
        System.out.println("Name: " + name);
        System.out.println("Number of Nights: " + numNights);
        System.out.println("Age: " + age);
        System.out.println("Total Cost: " + totalCost + " euro");
        System.out.println("Booking Confirmation: " + (canConfirmBooking ? "Confirmed" : "Not Confirmed"));

        // Display only the numeric confirmation number without any additional text
        System.out.println("Confirmation Number: " + confirmationNumber);

        //Thank the user for booking with us and to enjoy
        System.out.println("Thank you for booking your stay with us. See you soon! :)");

        scanner.close();
    }

    private static String generateShortNumericConfirmationNumber() {
        // Set the desired length of the shortened numeric confirmation number
        int length = 8;

        // Use a random number generator to pick digits from 0 to 9
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10); // Generates a random digit from 0 to 9
            sb.append(digit);
        }

        return sb.toString();
    }
}
