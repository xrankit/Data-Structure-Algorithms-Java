package singleLinkedList;

import java.util.Scanner;

public class PrintIthNode {
	
	public static NewNode takeInput()
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
				head =node;
				tail = node;
			}
			else
			{
				tail.next = node;
				tail = tail.next;
			}
			data = sc.nextInt();
		}
		return head;
	}
	public static void print_Ith_Node(NewNode head, int pos)
	{
		int i =0;
		NewNode temp = head;
		while(temp!=null)
		{
			if(i == pos)
			{
				System.out.println(temp.data);
			}
			i++;
			temp = temp.next;
		}
		System.out.println(temp);
	}
	public static void print(NewNode head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head= head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NewNode head = takeInput();
		print(head);
		int pos = sc.nextInt();
		print_Ith_Node(head, pos);
	}

}
