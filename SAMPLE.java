package DAY;
import java.util.Scanner;

public class SAMPLE {
		

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
    	System.out.println("create");
    	System.out.println("display");
    	System.out.println("update");
    	System.out.println("exit");
    	System.out.println("enter your option");
		
    	int option=sc.nextInt();
    	sc.nextLine();
	

	        switch (option) {
	            case 1:
	            	System.out.println("name");
	            	String name=sc.nextLine(); 
	            	
	            	System.out.println("age");
	            	int age =sc.nextInt();
	            	
	            	System.out.println("designation");
	            	System.out.println("1:tester");
	            	System.out.println("2:programmer");
	            	System.out.println("3:developer");
	            	
	            	System.out.println("enter designation");
	            	int designation=sc.nextInt();
	            	
	            			switch (designation) {
	            			case 1:
	            				System.out.print("p");
	            				break;
	            			case 2:
	            				System.out.print("t");
	            				break;
	            			case 3:
	            				System.out.print("d");
	            				break;
	            			default:
		            			System.out.print("invalid choice");
		            				break;	 
	            			}
	                break;

	            case 2:
	                System.out.println("display");
	                break;

	            case 3:
	                System.out.println("update");
	                break;
	            case 4:
    				System.out.print("exit");
    				break;
    				

	            default:
	                System.out.println("Invalid day");
	        }
	    }
	}
}