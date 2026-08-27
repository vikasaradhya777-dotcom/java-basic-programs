package DAY7;

public class example3 {

    public static void main(String[] args) {

        int a = 10000;
        int with = 2000;

        for (int i = 1; i <= a; i++) {

            if (i % with == 0) {
                System.out.println(i);
            }
        }
    }
}