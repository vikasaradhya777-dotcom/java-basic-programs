package DAY7;

public class binarynames {

    public static void main(String[] args) {

        String[] numbers = {"adithi", "ashu", "bashu", "vikas", "vikash"};

        String target = "ashu";

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (numbers[mid].equals(target)) {
                System.out.println("Element found at index " + mid);
                break;
            }

            else if (numbers[mid].compareTo(target) < 0) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
    }
}