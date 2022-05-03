package singleLinkedList;

import java.util.Scanner;

public class DeleteLinkedList {
	
	public static NewNode DeleteNode(int pos, NewNode head)
	{
		NewNode temp = head;
		if(pos==0)
		{
			head =temp.next;
			return head;
		}
		int i =0;
		
		while(i<pos-1)
		{
			temp = temp.next;
			i++;
		}
		temp.next =temp.next.next;
		return head;
	}
	public static NewNode SpecificPos(NewNode head, int data, int pos)
	{

		NewNode node = new NewNode(data);
		if(pos==0)
		{
			node.next = head;
			return node; 
		}
		int i =0;
		NewNode temp = head;
		while(i<pos-1)
		{
			temp = temp.next;
			i++;
		}
		node.next = temp.next; 
		temp.next = node;
		return head;
	}
	
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
		head = SpecificPos(head, 90, 2);
		print(head);
		DeleteNode(0, head);
		print(head);
	}

}
