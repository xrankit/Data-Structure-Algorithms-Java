package LinkedList;

class Nodes
{
    int data;
    Node next;
    Nodes(int d)
    {
        data = d;
        next = null;
    }
}
public class Search {
	
	Node head;    
	
    public void push(int new_data)
    {
       
        Node new_node = new Node(new_data);
 
       
        new_node.next = head;
 
      
        head = new_node;
    }
 
  
    public boolean search(Node head, int x)
    {
        Node current = head;    
        while (current != null)
        {
            if (current.data == x)
                return true;   
            current = current.next;
        }
        return false;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search llist = new Search();
		 
        /*Use push() to construct below list
        14->21->11->30->10  */
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);
 
        if (llist.search(llist.head, 21))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

}
