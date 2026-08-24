package DAY5;


import java.util.Scanner;

public class substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        int count = n * (n + 1) / 2;

        System.out.println("Number of substrings: " + count);
    }

}

