package basicarray;

import java.util.Scanner;
public class dynamicinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] array = new int[size];
		
		//taking inputs in array
		for(int i =0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		 //feed forward array
		for(int i =0; i<size; i++)
		{
			System.out.println(array[i] + "\t");
		}
		
		//backward array
		for(int i =size-1; i>=0; i--)
		{
			System.out.println(array[i] + "\t");
		}
	}

}
