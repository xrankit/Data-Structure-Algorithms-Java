package singleLinkedList;

import java.util.Scanner;

public class Length_LinkedList {
	
//	public static int FindLength(NewNode head)
//	{
//		if(head==null)
//		{
//			return 0;
//			
//		}
//		int length =0;
//		NewNode temp =head;
//		while(head!=null)
//		{
//			temp = 
//		}
//	}
	
	public static NewNode take_Input()
	{
		NewNode head = null;
		NewNode tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int length = 0;
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
				tail.next = node;
				tail = node;
//				tail = tail.next;
			}
			data = sc.nextInt();
			length++;
		}
		System.out.println(length);
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
