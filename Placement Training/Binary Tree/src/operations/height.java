package operations;

import java.util.ArrayList;

class SNode {
	int key;
	SNode left , right;
	public SNode(int data)
	{
		key = data;
		left = null;
		right = null;
	}
}
public class height {
	
	static SNode root;
	
	height()
	{
		root = null;
	}
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public void insert(int data)
	{
		arr.add(data);
		root = insertRec(root, 0);
	}
	
	public SNode insertRec(SNode root, int i)
	{
		if(i < arr.size())
		{
			SNode temp = new SNode(arr.get(i));
			root = temp;
			root.left = insertRec(root.left, 2 * i + 1);
			root.right = insertRec(root.right, 2 * i + 2);
		}
		return root;
	}
	
	int height()
	{
		return heightRec(root);
	}

	int heightRec(SNode root)
	{
		if(root == null)
			return 0;
		else {
			int l = heightRec(root.left);
			int r = heightRec(root.right);
			if(l > r)
				return l + 1;
			else
				return r + 1;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		height tree = new height();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		
		int h = tree.height();
		
		System.out.println("Height of tree: " + h);
	}

}
