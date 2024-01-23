import java.util.Scanner;

// Custom exception class
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class CommandLineInput {
    public static void main(String[] args) {
        

        // Array to store user input strings
        String  s ;

        System.out.println("Enter a Word:");
// ----------------------------------------------------------Try- With Resource instructed by Neha MAm---------------------------------3.0-------------------------
        try (Scanner scanner = new Scanner(System.in);){
                s= scanner.next();
                validateInput(s);
            }
        catch (NoMatchException e) {
            System.out.println("Error: " + e);
            return;
        }

        System.out.println(" \nCongratulations!! You'r a Leader.. User entered strings: " +s);
        
    }
	

    // Method to validate user input
    private static void validateInput(String input) throws NoMatchException {
		//------------------------------_Edited as Mam Instructed -----------------------------------------------------4.0------------------------
        if (!input.equalsIgnoreCase("India")) {
            throw new NoMatchException("Input does not match 'India'.");
        }
    }
}
