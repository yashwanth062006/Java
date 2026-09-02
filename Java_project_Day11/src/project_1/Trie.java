package project_1;
public class Trie {


	    static class Node {
	        Node[] child = new Node[26];
	        boolean end;
	    }

	    static Node root = new Node();

	    static void insert(String word) {
	        Node curr = root;

	        for (int i = 0; i < word.length(); i++) {

	            int index = word.charAt(i) - 'a';

	            if (curr.child[index] == null) {
	                curr.child[index] = new Node();
	            }

	            curr = curr.child[index];
	        }

	        curr.end = true;
	    }
	    static void display(Node curr, String word){

	        if (curr.end) {
	            System.out.println(word);
	        }

	        for (int i = 0; i < 26; i++) {

	            if (curr.child[i] != null) {
	                display(curr.child[i],
	                        word + (char)(i + 'a'));
	            }
	        }
	    }

	    public static void main(String[] args) {

	        insert("cap");
	        insert("can");
	        insert("car");
	        insert("cat");

	        display(root, "");
	    }
	}