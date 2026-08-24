package DAY5;

public class dob{

    
    public static int getHash(char ch) {
        return ch - 'a';
    }

    public static void main(String[] args) {

        String text = "programming";

        int[] hash = new int[26];

        // Store character frequency
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            int index = getHash(ch);

            hash[index]++;
        }
        for (int i = 0; i < 26; i++) {

            if (hash[i] > 1) {

                char ch = (char) (i + 'a');

                System.out.println(ch + " is repeated " 
                        + hash[i] + " times");
            }
        }
    }
}
			
			
				

