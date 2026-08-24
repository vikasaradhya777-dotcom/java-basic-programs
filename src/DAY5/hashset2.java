package DAY5;
import java.util.*;

import java.util.HashSet;

public class hashset2 {
	public static void main(String[] args) {
		HashSet c=new HashSet<>();
		c.add("w");
		c.add("r");
		c.add("y");
		c.add("u");
		c.add("i");
		c.add("p");
		c.add("g");
		c.add("j");
		c.add("l");
		c.add("m");
		c.add("n");
		c.add(null);
		System.out.println(c);
		c.add(2);
		c.add("vikas");
		System.out.println(c);
	
		Iterator<Integer> it = c.iterator();

        while (it.hasNext()) {
        	System.out.println(it.next());
		
	}
System.out.println(c);
}}
