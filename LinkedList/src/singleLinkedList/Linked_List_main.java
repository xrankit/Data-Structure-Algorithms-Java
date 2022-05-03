package singleLinkedList;

public class Linked_List_main {

	public static void print(NewNode head)
	{
		while(head!=null) {
		
		System.out.println(head.data + " ");
		head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		NewNode node1 = new NewNode(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
//		
//		NewNode node2 = new NewNode(20);
//		node1.next = node2;
//		
//		System.out.println(node2);
//		System.out.println(node1.next);
		
		
		NewNode node1 = new NewNode(10);
		NewNode node2 = new NewNode(20);
		NewNode node3 = new NewNode(30);
		node1.next = node2;
		node2.next = node3;
		NewNode head = node1;
		
//		while(head!=null)
//		{
//			System.out.println(head.data+ " ");
//			head = head.next;
//		}
		
		print(head);
	}

}
