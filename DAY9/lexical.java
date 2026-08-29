package DAY9;

import java.util.*;

public class lexical {

    public static void main(String[] args) {

        String[] names = {
            "rahul", "ravi", "anand", "rakesh"
        };

        String search = "ra";

        ArrayList<String> result = new ArrayList<>();

        for (String name : names) {

            if (name.contains(search)) {
                result.add(name);
            }
        }

        System.out.println("Search result:");

        for (String name : result) {
            System.out.println(name);
        }
    }
}