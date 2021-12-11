package Loops;
import java.util.Scanner;
import java.lang.Math;
public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		double ans = 0;
		while(n!=0)
		{
			int bit = n&1;
			ans = (bit * Math.pow(10, i)) + ans;
			n = n<<1;
			i++;
		}
		System.out.print(ans);
		
	}

}
