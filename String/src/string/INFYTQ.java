package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class INFYTQ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Input: Given a list of numbers separated with a comma. The numbers 5 and 8 are present in the list.
//		Assume that 8 always comes after 5.
//		Case 1: num1 -> Add all numbers which do not lie between 5 and 8 in the Input List.
//		Case 2: num2 -> Numbers formed by concatenating all numbers from 5 to 8 in the list
//		.Output: Sum of num1 and num2
//		Example: 3,2,6,5,1,4,8,9
//		Num1: 3+2+6+9 =20
//		Num2: 5148O/p=5148+20 = 5168
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(",");
//		for(int i =0;i<str.length;i++)
//		{
//			System.out.println(str[i]);
//		}
			int i = 0,j = 0,sum1 = 0,sum2 = 0;   
		     while(i<str.length-1)  
		     {  
		       if(str[i].matches("5"))  
		       break;  
		       sum1 += Integer.parseInt(str[i]);  
		       i++;  
		     }  
		     while(i<str.length-1)  
		     {  
		       if(str[i-1].matches("8"))  
		       break;  
		       sum2 = sum2 * 10;  
		       sum2 += Integer.parseInt(str[i]);  
		       i++;  
		     }  
		      while(i<str.length)  
		     {  
		       sum1 +=Integer.parseInt(str[i]);  
		       i++;  
		     }  
		     System.out.println(sum2 + sum1); 
	}

}
