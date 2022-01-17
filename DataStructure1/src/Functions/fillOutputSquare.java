package Functions;

import java.util.Scanner;
public class fillOutputSquare {
	// pass by value always used in java nothing other;
	public static int square(int a){
		int ans = a * a;
		return ans;
    }

    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	System.out.println(a);
		a = square(a);
		System.out.println(a);
    }   
}
