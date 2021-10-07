package getiingStarted;

import java.util.Scanner;
public class CountDigits {
	
	static void printDigit(int N)
	{
	    int r;
	    if (N == 0) {
	        return;
	    }
	    r = N % 10;
	    
	    printDigit(N / 10);
	  
	    System.out.println(r);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		printDigit(N);
	}

}
