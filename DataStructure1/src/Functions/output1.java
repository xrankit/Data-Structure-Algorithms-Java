package Functions;

import java.util.Scanner;
public class output1 {
	public static void func(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		func(a,b);
	}

}
