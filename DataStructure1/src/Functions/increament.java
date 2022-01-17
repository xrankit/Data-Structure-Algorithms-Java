package Functions;
import java.util.Scanner;
public class increament {
	// pass by value
	public static int increaments(int n)
	{
		n = n+1;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println((a));
		System.out.println(increaments(a));
	}

}
