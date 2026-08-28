package project_1;

public class merged_linked_list {
	static class Node{
		int data;
		Node next;
		 Node(int data){
			 this.data=data;
		 }
	}

    public static void main(String[] args) {
    	
    	Node first=new Node(10);
    	Node second=new Node(20);
    	Node third=new Node(30);
    	
    	first.next=second;
    	second.next=third;
    	
    	Node fourth=new Node(40);
    	Node fifth=new Node(50);
    	Node sixth=new Node(60);
    	
    	fourth.next=fifth;
    	fifth.next=sixth;
    	
    	third.next=fourth;
    	
    	Node current=first;
    	

        System.out.println("Merged Linked List:");
        
        while(current!=null) {
        	System.out.print(current.data+" ");
        	current=current.next;
        }  	
     }
 }

