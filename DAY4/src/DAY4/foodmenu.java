package DAY4;

import java.util.Scanner;

public class foodmenu {
	public static void main(String[] args) {
		 System.out.println("enter your choice");
		         Scanner sc = new Scanner(System.in);
		         int choice = sc.nextInt();
		         switch (choice) {
		         case 1:
		             System.out.println("pizza");
		             break;
		         case 2:
		             System.out.println("burger");
		             break;

		         case 3:
		             System.out.println("pasta");
		             break;

		         case 4:
		             System.out.println("rotti");
		             break;
		         case 5:
		             System.out.println("cake");
		             break;
		         case 6:
		             System.out.println("ice cream");
		             break;
		         case 7:
		             System.out.println("mudde");
		             break;
		         default:
		             System.out.println("Invalid choice");
		         }

		         sc.close();
		     }
		 } 




