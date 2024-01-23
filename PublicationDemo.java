import java.util.Scanner;

// Interface representing a displayable entity
interface Displayable {
    void display();
}

// Base class representing a Publication
 abstract class Publication implements Displayable {
    private String title;
    private float price;

    public Publication(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }
	 @Override
	 abstract public void display();
}

// Derived class Book inheriting from Publication and implementing Displayable interface
class Book extends Publication {
    private int pageCount;
    public Book(String title, float price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void display() {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
        System.out.println("Book Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Page Count: " + getPageCount());
    }
}

// Derived class Tape inheriting from Publication and implementing Displayable interface
class Tape extends Publication {
    private float playingTime;

    public Tape(String title, float price, float playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }

    public float getPlayingTime() {
        return playingTime;
    }


    @Override
    public void display() {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
        System.out.println("Tape Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Price: ₹" + getPrice());
        System.out.println("Playing Time: " + getPlayingTime() + " minutes");
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
    }
}

// Main class for the demo
public class PublicationDemo{
    private static Scanner scanner = new Scanner(System.in);

    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static float getPriceInput(String prompt) {
        try {
            return Float.parseFloat(getUserInput(prompt));
        } catch (NumberFormatException e) {
            System.out.println("Invalid Value!! Setting the value to zero.");
            return 0;
        }
    }

    private static int getPageCountInput(String prompt) {
        try {
			int pageCount = Integer.parseInt(getUserInput(prompt));
			if(pageCount> Integer.MAX_VALUE){
				throw new ArithmeticException();
			}
            return pageCount;
        } catch (NumberFormatException e) {
            System.out.println(e+" Setting value to zero.");
            return 0;
        }
    }

    private static float getPlayingTimeInput(String prompt) {
        try {
            return Float.parseFloat(getUserInput(prompt));
        } catch (NumberFormatException e) {
             System.out.println("Invalid Value!! Setting value to zero.");
            return 0;
        }
    }
	
	// --------------------------------------------------------------------OneMethod instructed by Neha MAM-----------------------------------------------------
	private static float getInput(String prompt) {
         try {
            return Float.parseFloat(getUserInput(prompt));
        } catch (NumberFormatException e) {
             System.out.println("Invalid Value!! Setting value to zero.");
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println("\n-----------------Enter book details----------------------");
        String bookTitle = getUserInput("Enter title: ");
       // float bookPrice = getPriceInput("Enter price: ");
       // int pageCount = getPageCountInput("Enter page count: ");
	   
	   // -----------------------------------------------------------------------Instructed by NehA Mam--------------------------------------------------
	   float bookPrice = getInput("Enter Price: ");
	   int pageCount = (int) getInput("Enter Page: ");
	   
       Book book = new Book(bookTitle, bookPrice, pageCount);

        System.out.println("\n--------------------------Enter tape details:---------------------");
        String tapeTitle = getUserInput("Enter title: ");
        //float tapePrice = getPriceInput("Enter price: ");
        // float playingTime = getPlayingTimeInput("Enter playing time in minutes: ");
		
	   // Instructed by NehA Mam
		float tapePrice = getInput("Enter Price: ");
	    float playingTime = getInput("Enter playing time in minutes:  ");
		
        Tape tape = new Tape(tapeTitle, tapePrice, playingTime);

       // Displaying Information
		book.display();
		tape.display();
    }
}
