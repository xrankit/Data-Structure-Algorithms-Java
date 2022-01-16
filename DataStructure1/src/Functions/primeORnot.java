package Functions;
import java.util.Scanner;
public class primeORnot {
	
	public static boolean isPrime(int n)
	{
		for(int i = 2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
	}

}
