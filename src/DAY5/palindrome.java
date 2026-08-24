package DAY5;

public class palindrome {

    public static void main(String[] args) {

        String name = "madam";
        String r = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            r = r + name.charAt(i);
        }

        System.out.println(r);

        if (name.equals(r)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NotPalindrome");
        }
    }
}