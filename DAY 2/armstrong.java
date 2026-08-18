package day2;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int digit = sc.nextInt();
		int c=digit;
		int sum=0;
		while(digit!=0) {
			int last=digit%10;
			sum=sum+last*last*last;
			digit/=10;
		}
		if(sum ==c) {
			System.out.println("armstrong");
		}
			
		
		
	}

}
