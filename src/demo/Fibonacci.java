package demo;

public class Fibonacci {
	void fibonacci(int n) {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }


	public static void main(String[] args) {
		  Fibonacci test = new Fibonacci();

	        test.fibonacci(10);
	    }
	}
		// TODO Auto-generated method stub

	


