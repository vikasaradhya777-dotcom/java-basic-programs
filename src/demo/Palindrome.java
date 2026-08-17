package demo;

public class Palindrome {
	boolean checkPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return original == reverse;
    }

	public static void main(String[] args) {
		 Palindrome test = new Palindrome();

	        boolean result = test.checkPalindrome(121);

	        System.out.println("Palindrome = " + result);
	    }
	}
	


