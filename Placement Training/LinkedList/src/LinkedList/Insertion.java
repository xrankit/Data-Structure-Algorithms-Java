package LinkedList;

public class Insertion {
	
	Node head; 
	  static class Node{
	    int data;
	    Node next;

	  
	    Node(int d){
	      data = d;
	      next = null;
	    }
	  }
	  
	  //Insertion at the start of the list.

	  public void insertionAtStart(int new_node_data){
	    Node new_node = new Node(new_node_data);
	    
	    new_node.next = head;
	    
	    head = new_node;
	    }

	

	  public void insertionAtEnd(int new_node_data){
	
	    Node new_node = new Node(new_node_data);

	  
	    if(head == null){
	      head = new_node;
	    }
	   
	    else{
	      Node last = head;
	      while(last.next != null){
	        last = last.next;
	      }
	      last.next = new_node;
	    }
	  }

	  //Insertion after a specific node.

	 
	  public void insertionAfterSpecificNode(Node prev_node, int new_node_data){
	    if(prev_node == null){
	      System.out.println("Error -- Given Previous Node  is Null.");
	      return ;
	    }
	    Node new_node = new Node(new_node_data);
	    new_node.next = prev_node.next;
	    prev_node.next = new_node;
	  }

	  //To print the data of all the nodes of the list.
	  public void printList(){
	    Node tempNode = head;
	    while (tempNode!= null) {
	      System.out.print(tempNode.data + " " );
	      tempNode = tempNode.next;
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion list = new Insertion();
		   
		    list.head = new Node(5);
		
		    list.insertionAtEnd(10);
		   
		    list.insertionAtStart(15);
		   
		    list.insertionAfterSpecificNode(list.head.next,7);

		   
		    list.printList();
	}

}
