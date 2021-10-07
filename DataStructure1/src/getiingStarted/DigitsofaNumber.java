package getiingStarted;

import java.util.Scanner;
public class DigitsofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int j=num;j>0;j=j/10)
		{
			int remain = j%10;
			System.out.println(remain);
		}
	}

}
