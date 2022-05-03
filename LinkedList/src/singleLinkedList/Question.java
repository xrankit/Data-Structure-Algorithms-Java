package singleLinkedList;

public class Question {
	
	 public class Node {

	}
	public static void print(Nodes<Integer> head){
			Nodes<Integer> temp = head;

			while(temp != null){
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
			System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodes<Integer> node1 = new Nodes<Integer>(10);
		Nodes<Integer> node2 = new Nodes<Integer>(20);
		Nodes<Integer> node3 = new Nodes<Integer>(30);
		Nodes<Integer> node4 = new Nodes<Integer>(40);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		print(node2);
	}

}
