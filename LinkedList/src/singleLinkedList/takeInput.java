package singleLinkedList;
import java.util.Scanner;
public class takeInput {
	
	public static NewNode take_Input()
	{
		NewNode head = null;
		NewNode tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		 
		while(data!=-1) 
		{
			NewNode node = new NewNode(data);
			if(head==null)
			{
				head = node;
				tail = node;
			}
			else
			{
//				NewNode temp = head;
//				while(temp.next!=null)
//				{
//					temp=temp.next;
//				}
//				temp.next = node;
				
				tail.next = node;
				tail = node;
//				tail = tail.next;
				
			}
			data = sc.nextInt();
		}
		return head;
	}

	public static void print(NewNode head )
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head= head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewNode head = take_Input();
		print(head);
	}

}
