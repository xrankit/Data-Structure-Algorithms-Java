package Functions;

import java.util.Scanner;

public class FahrenheittoCelsius {
	
	public static void farToCel(int s, int e, int w)
	{
		for(int i = s; i<=e; i= i+20)
		{
			int cel = (5*(i-32))/9;
			System.out.println(i+"\t"+cel);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); 
		int E = sc.nextInt(); 
		int W = sc.nextInt(); 
		
//		The formula for converting Fahrenheit to Celsius is:
//		    Celsius Value = (5/9)*(Fahrenheit Value - 32)
		farToCel(S,E,W);
	}

}
