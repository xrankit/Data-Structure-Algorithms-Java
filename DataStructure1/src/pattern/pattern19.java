package pattern;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//		0	
//		1	1	
//		2	3	5	
//		8	13	21	34	
//		55	89	144	233	377
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.println(a);
		System.out.println(b+" "+c);
		for(int i = 3; i<=n;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				a=b;
				b=c;
				c=a+b;
				System.out.print(c+" ");
				
				
			}
			System.out.println();
		}
	}
}
