package project_1;

public class LCA {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node find(Node next, int n1, int n2) {

        if (next == null) {
            return null;
        }

        if (n1 < next.data && n2 < next.data) {
            return find(next.left, n1, n2);
        }

        if (n1 > next.data && n2 > next.data) {
            return find(next.right, n1, n2);
        }

        return next;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        Node result = find(root, 2, 7);

        System.out.println("LCA = " + result.data);
    }
}
