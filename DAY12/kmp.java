package DAY12;



public class kmp {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int[] lps = new int[m];

        int j = 0;

        for (int i = 1; i < m; i++) {

            while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
                j = lps[j - 1];

            if (pattern.charAt(i) == pattern.charAt(j))
                j++;

            lps[i] = j;
        }

        j = 0;

        for (int i = 0; i < n; i++) {

            while (j > 0 && text.charAt(i) != pattern.charAt(j))
                j = lps[j - 1];

            if (text.charAt(i) == pattern.charAt(j))
                j++;

            if (j == m) {
                System.out.println("Pattern found at index " + (i - m + 1));
                j = lps[j - 1];
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABABCABAB";
        String pattern = "ABAB";

        search(text, pattern);
    }
}