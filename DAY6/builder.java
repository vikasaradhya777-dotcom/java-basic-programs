package DAY6;

public class builder {

    public static void main(String[] args) {

                StringBuilder c = new StringBuilder();

        c.append("Vikas");
        c.insert(5, " Aradhya");
        c.replace(0, 5, "Mr Vikas");
        c.delete(0, 3);
        System.out.println(c);


    
    }
}