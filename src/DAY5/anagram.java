package DAY5;

public class anagram {
	
public static void main(String[] args) {
	
}
	String s1 = "listen";
	String s2 = "silent";

	int i = 0;

	while (i < s1.length()) {

	    char last = s1.charAt(i);

	    int j = 0;

	    while (j < s2.length()) {

	        char las = s2.charAt(j);

	        if (last == las) {
	            System.out.println(last + " is present in both");
	        }

	        j++;
	    }

	    i++;
	} }}