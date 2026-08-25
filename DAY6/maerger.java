package DAY6;
public class maerger{

    public static void main(String[] args) {

        String[] array1 = {"vikash", "vikas", "thilak"};
        String[] array2 = {"ullas", "vikas", "yeshas"};

        String[] merged = new String[array1.length + array2.length];

        int index = 0;

        
        for (int i = 0; i < array1.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {
                if (merged[j].equals(array1[i])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                merged[index] = array1[i];
                index++;
            }
        }

        
        for (int i = 0; i < array2.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {
                if (merged[j].equals(array2[i])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                merged[index] = array2[i];
                index++;
            }
        }

        System.out.println("Merged array without duplicates:");

        for (int i = 0; i < index; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}