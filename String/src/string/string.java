package string;
import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		char charArray[] = str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
	}

}
