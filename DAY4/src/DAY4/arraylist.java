package DAY4;
import java.util.ArrayList;
public class arraylist {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");
        list.add("A");
        list.add(null);
        System.out.println("Size of ArrayList after adding elements: " + list.size());
        System.out.println("ArrayList is empty after adding values: " + list.isEmpty());
        System.out.println("Contents of ArrayList after adding values: " + list);
        boolean b1 = list.contains("E");
        System.out.println("Value E is present: " + b1);
        boolean b2 = list.contains("R");
        System.out.println("Value R is present: " + b2);
        list.remove("B");
        System.out.println("Size of ArrayList after deletion: " + list.size());
        System.out.println("Contents of ArrayList after deletion: " + list);
        list.clear();
    }
}