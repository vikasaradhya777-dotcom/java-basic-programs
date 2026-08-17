package demo;

public class Factorial {
	 int factorial(int n) {
	        int fact = 1;

	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }

	        return fact;}
	 

	public static void main(String[] args) {
		Factorial test = new Factorial();
		 int result = test.factorial(5);

	        System.out.println("Factorial = " + result);
	}

}
