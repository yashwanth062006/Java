package project_1;

public class circular_linked_list {

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Forward connections
        first.next = second;
        second.next = third;
        third.next = first;

        // Backward connections
        first.previous = third;
        second.previous = first;
        third.previous = second;

        // Forward
        Node current = first;

        System.out.println("Forward:");

        while (current.next != first) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.print(current.data + " ");

        // Backward
        current = third;

        System.out.println("");
        System.out.println("Backward:");

        while (current.previous != third) {
            System.out.print(current.data + " ");
            current = current.previous;
        }

        System.out.print(current.data + " ");
    }
}
	
		


