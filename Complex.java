import java.util.Random;
import java.util.*;
public class Complex {
    private double real;
    private double imaginary;

    // Constructors
    public Complex() {
        this(0.0, 0.0); // Default values
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter and Setter methods
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Static methods for operations
    public static Complex add(Complex num1, Complex num2) {
        return new Complex(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }

    public static Complex add(Complex num1, Complex num2, Complex num3) {
        return add(add(num1, num2), num3);
    }

    public static Complex multiply(Complex num1, Complex num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new Complex(realPart, imaginaryPart);
    }

    public static Complex multiply(Complex num1, Complex num2, Complex num3) {
        return multiply(multiply(num1, num2), num3);
    }

    // Method to print complex number
    public void print() {
        System.out.println("Complex Number: " + getReal() + " + " + getImaginary() + "i");
    }

    // Method to read complex number from user input
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part: ");
        setReal(scanner.nextDouble());
        System.out.print("Enter imaginary part: ");
        setImaginary(scanner.nextDouble());
    }

    // Other utility methods
    public double absoluteValue() {
        return Math.sqrt(getReal() * getReal() + getImaginary() * getImaginary());
    }

    public boolean isPrime() {
        int magnitude = (int) absoluteValue();
        if (magnitude < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(magnitude); i++) {
            if (magnitude % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isOdd() {
        return (int) getReal() % 2 != 0 && getImaginary() == 0;
    }

    public boolean isEven() {
        return (int) getReal() % 2 == 0 && getImaginary() == 0;
    }

    public static Complex findMin(Complex... numbers) {
    if (numbers.length == 0) {
        throw new IllegalArgumentException("No numbers provided.");
    }

    Complex min = numbers[0];
    for (Complex number : numbers) {
        if (number.getReal() < min.getReal() ||
                (number.getReal() == min.getReal() && number.getImaginary() < min.getImaginary())) {
            min = number;
        }
    }
    return min;
}

public static Complex findMax(Complex... numbers) {
    if (numbers.length == 0) {
        throw new IllegalArgumentException("No numbers provided.");
    }

    Complex max = numbers[0];
    for (Complex number : numbers) {
        if (number.getReal() > max.getReal() ||
                (number.getReal() == max.getReal() && number.getImaginary() > max.getImaginary())) {
            max = number;
        }
    }
    return max;
}

public static Complex findAvg(Complex... numbers) {
    if (numbers.length == 0) {
        throw new IllegalArgumentException("No numbers provided.");
    }

    double sumReal = 0.0;
    double sumImaginary = 0.0;

    for (Complex number : numbers) {
        sumReal += number.getReal();
        sumImaginary += number.getImaginary();
    }

    double avgReal = sumReal / numbers.length;
    double avgImaginary = sumImaginary / numbers.length;

    return new Complex(avgReal, avgImaginary);
}

    // Generate a random complex number
    public static Complex generateRandomComplex() {
        Random random = new Random();
        return new Complex(Math.floor(random.nextDouble()*100), Math.floor(random.nextDouble()*100));
    }

public static void main(String[] args) {
	
	//(Object e)-> {System.out.println();};
        Scanner scanner = new Scanner(System.in);
		System.out.println("No of complex no. for Operation");
			Complex obj;
			obj =()->{System.out.println("fff");};
			int n = scanner.nextInt();
			Complex [] c = new Complex [n];
			for(int i = 0; i<n; i++){
				 c[i] = new Complex();
				System.out.println("Enter values for complex:"+(i+1));
				c[i].read();
			}
			
        // Read input for complex numbers
        /*Complex complex1 = new Complex();
        System.out.println("Enter values for complex1:");
        complex1.read();

        Complex complex2 = new Complex();
        System.out.println("Enter values for complex2:");
        complex2.read();

        Complex complex3 = new Complex();
        System.out.println("Enter values for complex3:");
        complex3.read();*/

        // Choose operation
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Check Odd/Even");
        System.out.println("4. Check Prime");
        System.out.println("5. Generate Random Complex Number");
        System.out.println("6. Calculate Average");
        System.out.println("7. Calculate Absolute Value");
        System.out.println("8. Find Minimum");
        System.out.println("9. Find Maximum");
		

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
				Complex resultAdd = new Complex();
                // Add complex numbers
				if(n>2){
					for(int i=0; i<n; i++){
						 resultAdd =  Complex.add(resultAdd , c[i]);
					}
				}
				else if(n==2){
					resultAdd = Complex.add(c[0], c[1]);
					System.out.println("Result of addition: ");
				}else  resultAdd =  new Complex();
				resultAdd.print();
				break;
            case 2:
				Complex resultMultiply = new Complex();
				
                // Multiply complex numbers
               if(n>2){
				   resultMultiply = Complex.multiply(c[0], c[1]);
					for(int i=2; i<n; i++){
						
						resultMultiply =  Complex.multiply(resultMultiply, c[i]);
					}
				}
				else if(n==2){
					resultMultiply =  Complex.multiply(c[0], c[1]);
					System.out.println("Result of Multiply: ");
				}else  resultMultiply = new Complex();
				resultMultiply.print();
				break;
           
             case 3:
                // Check Odd/Even
                for(Complex i: c){
					System.out.println("Is complex1 odd " + i.isOdd());
              
				}
                break;
            case 4:
               int k= 1;
				   for(Complex i: c){
					System.out.println("Is complex"+k +" prime " + i.isPrime());
				k+=1;
				}
               
                break;
            case 5:
                // Generate Random Complex Number
                Complex randomComplex = Complex.generateRandomComplex();
                System.out.println("Random Complex Number: ");
                randomComplex.print();
                break;
            case 6:
                // Calculate Average
				  Complex avgComplex = Complex.findAvg(c);
                System.out.println("Average: ");
                avgComplex.print();
                break;
            case 7:
                // Calculate Absolute ValueBase
					k =1;
				   for(Complex i: c){
					System.out.println("Absolute Value of complex"+k+": "+ i.absoluteValue());
				k+=1;
				}
                //System.out.println("Absolute Value of complex1: " + complex1.absoluteValue());
               //// System.out.println("Absolute Value of complex2: " + complex2.absoluteValue());
               // System.out.println("Absolute Value of complex3: " + complex3.absoluteValue());
                break;
            case 8:
                // Find Minimum
				Complex minComplex = Complex.findMin(c);
                System.out.println("Minimum: ");
                minComplex.print();
                break;
            case 9:
                // Find Maximum
                Complex maxComplex = Complex.findMax(c);
                System.out.println("Maximum: ");
				maxComplex.print();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}




