package DAY8;



public class work3 {

    public static void main(String[] args) {

        int[] n = {1,5,8,6,4,3,8,9,7};

        int windowSize = 3;

        for (int k = 0; k <= n.length - windowSize; k++) {

            int max = n[k];

            for (int i = k; i < k + windowSize; i++) {

                if (n[i] > max) {
                    max = n[i];
                }
            }

            System.out.println( max);
        }
    }
}