package getiingStarted;

import java.util.Scanner;
public class ReverseDigits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0;
		for(int j=num;j>0;j=j/10)
		{
			int remain = j%10;
			n = (n*10) + remain;
			System.out.println(remain);
		}
		System.out.println(n);
	}

}
