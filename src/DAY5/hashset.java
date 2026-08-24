package DAY5;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet set=new HashSet<>();
		set.add("c");
		set.add("u");
		set.add("b");
		set.add("p");
		set.add("L");
	    System.out.println(set.size());
		System.out.println(set.isEmpty());
        set.remove("b");
        set.contains("b");
        System.out.println(set);
}}
