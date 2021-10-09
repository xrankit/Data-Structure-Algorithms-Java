package getiingStarted;

import java.util.Scanner;
public class InverseofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		int[] array = new int[10];
		for(int i=num;i>0;i=i/10)
		{
			int remain = i %10;
			System.out.println("remain"+remain);
			count++;
			System.out.println(count+"count");
			array[remain] = count;
		}
		for(int i =1;i<=count;i++)
		{
			System.out.print(array[i]);
		}
	}

}
