package DAY6;

public class window2 {

    public static void main(String[] args) {

        int[] number = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int start = 0;
        int sum = 0;
        int minlength = number.length + 1;

        for (int k = 0; k < number.length; k++) {

           
            sum = sum + number[k];

          
            while (sum >= target) {

                int length = k - start + 1;

                if (length < minlength) {
                    minlength = length;
                }

                sum = sum - number[start];
                start++;
            }
        }

      
            System.out.println("Minimum window length = " + minlength);
        }
    }
