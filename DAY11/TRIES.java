package DAY11;



public class TRIES {

	    static class Node {
	        Node[] child = new Node[26];
	    }

	    static Node root = new Node();

	    static void insert(String word) {
	        Node temp = root;

	        for (char c : word.toCharArray()) {
	            int i = c - 'A';

	            if (temp.child[i] == null)
	                temp.child[i] = new Node();

	            temp = temp.child[i];
	        }
	    }

	    static void print(Node root, String space) {

	        for (int i = 0; i < 26; i++) {
	            if (root.child[i] != null) {
	                System.out.println(space + (char)('A' + i));
	                print(root.child[i], space + "  ");
	            }
	        }
	    }

	    public static void main(String[] args) {
			
		
	        insert("CAT");
	        insert("CAN");
	        insert("CAB");
	        insert("CAR");

	        System.out.println("ROOT");
	        print(root, "");
	    }
	}