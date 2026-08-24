package DAY4;

import java.util.Scanner;

public class weekdays {
	 public static void main(String[] args) {
		 System.out.println("enter your choice");
		         Scanner sc = new Scanner(System.in);

		         

		 		/*
		 		 * // System.out.println("Enter your choice:");
		 		 * //System.out.println("1. Addition"); // System.out.println("2. Subtraction");
		 		 * // System.out.println("3. Multiplication");
		 		 * //System.out.println("4. Division");
		 		 */
		         int choice = sc.nextInt();

		         switch (choice) {

		         case 1:
		             System.out.println("monday");
		             break;

		         case 2:
		             System.out.println("tuesday ");
		             break;

		         case 3:
		             System.out.println("wednesday");
		             break;

		         case 4:
		             System.out.println("thursday");
		             break;
		         case 5:
		             System.out.println("friday");
		             break;
		         case 6:
		             System.out.println("saturday");
		             break;
		         case 7:
		             System.out.println("sunday");
		             break;
		         default:
		             System.out.println("Invalid choice");
		         }

		         sc.close();
		     }
		 } 

