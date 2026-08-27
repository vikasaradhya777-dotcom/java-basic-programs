package DAY7;;

public class mearg {

    static void mergesort(String[] names, int left, int right) {

        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;

        mergesort(names, left, middle);
        mergesort(names, middle + 1, right);

        String[] temporary = new String[right - left + 1];

        int leftIndex = left;
        int rightIndex = middle + 1;
        int tempIndex = 0;

        while (leftIndex <= middle && rightIndex <= right) {

            if (names[leftIndex].compareTo(names[rightIndex]) < 0) {
                temporary[tempIndex++] = names[leftIndex++];
            } else {
                temporary[tempIndex++] = names[rightIndex++];
            }
        }

        while (leftIndex <= middle) {
            temporary[tempIndex++] = names[leftIndex++];
        }

        while (rightIndex <= right) {
            temporary[tempIndex++] = names[rightIndex++];
        }

        for (int index = 0; index < temporary.length; index++) {
            names[left + index] = temporary[index];
        }
    }

    public static void main(String[] args) {

        String[] names = {"Vikas", "Ashu", "Bashu", "Adithi", "Vikash"};

        mergesort(names, 0, names.length - 1);

        System.out.println("Sorted names:");

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}