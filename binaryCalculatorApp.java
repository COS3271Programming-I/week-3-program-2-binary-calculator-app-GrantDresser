// Program: binaryCalculatorApp.java
// Grant Dresser
// 2/6/2026

import java.util.Scanner;

public class binaryCalculatorApp {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // Receive the binary inputs as strings 
        System.out.print("Enter binary input for x: ");
        String xBinary = input.nextLine();

        System.out.print("Enter binary input for y: ");
        String yBinary = input.nextLine();

        // Convert the binart inputs to decimal

        int x = Integer.parseInt(xBinary, 2);
        int y = Integer.parseInt(yBinary, 2);

        // Perform the calculations 
         int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y; // no remainder

        // Convert results back to binary
        System.out.println("\nResults (in binary):");
        System.out.println("x + y = " + Integer.toBinaryString(sum));
        System.out.println("x - y = " + Integer.toBinaryString(difference));
        System.out.println("x * y = " + Integer.toBinaryString(product));
        System.out.println("x / y = " + Integer.toBinaryString(quotient));

            // Error check
            if (!xBinary.matches("[01]+") || !yBinary.matches("[01]+")) {
                System.out.println("Error: Please enter valid binary numbers (0s and 1s only).");
                input.close();
                return;
            }
            input.close();
        }
    }
    


