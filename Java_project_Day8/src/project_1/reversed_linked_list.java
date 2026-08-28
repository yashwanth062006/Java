package project_1;

public class reversed_linked_list {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Reverse the linked list
        Node previous = null;
        Node current = first;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        // Print reversed list
        System.out.println("Reversed Linked List:");

        current = previous;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}