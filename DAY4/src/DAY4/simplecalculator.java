package DAY4;

import java.util.Scanner;

public class simplecalculator {

    public static void main(String[] args) {
System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;

		/*
		 * // System.out.println("Enter your choice:");
		 * //System.out.println("1. Addition"); // System.out.println("2. Subtraction");
		 * // System.out.println("3. Multiplication");
		 * //System.out.println("4. Division");
		 */
        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            System.out.println("Addition: " + (a + b));
            break;

        case 2:
            System.out.println("Subtraction: " + (a - b));
            break;

        case 3:
            System.out.println("Multiplication: " + (a * b));
            break;

        case 4:
            System.out.println("Division: " + (a / b));
            break;

        default:
            System.out.println("Invalid choice");
        }

        sc.close();
    }
} 