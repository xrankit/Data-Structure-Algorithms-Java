package pattern;

import java.util.Scanner;
public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1	
//		2	3	
//		4	5	6	
//		7	8	9	10	
//		11	12	13	14	15
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print(j+i-1+" ");
			}
			System.out.println();
		}
	}

}
