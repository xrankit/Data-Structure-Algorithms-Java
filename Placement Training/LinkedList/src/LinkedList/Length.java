package LinkedList;
 class Node
{
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class Length {
	 Node head; 
	 
	    public void push(int new_data)
	    {
	     
	        Node new_node = new Node(new_data);
	 
	        new_node.next = head;
	 
	  
	        head = new_node;
	    }
	 
	
	    public int getCount()
	    {
	        Node temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Length llist = new Length();
	        llist.push(1);
	        llist.push(3);
	        llist.push(1);
	        llist.push(2);
	        llist.push(1);
	 
	        System.out.println("Count of nodes is " +
	                           llist.getCount());
	}

}
