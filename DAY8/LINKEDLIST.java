package DAY8;

public class LINKEDLIST {

    static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        node first = new node(10);
        node second = new node(20);
        node third = new node(30);

        first.next = second;
        second.next = third;

        node current = first;

        while (current != null) {

            System.out.println(current.data);

            current = current.next;
        }
    }
}