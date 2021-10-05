package getiingStarted;

import java.util.Scanner;
public class PrintallPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int low = sc.nextInt();
	        int high = sc.nextInt();
	        boolean flag = true;
	        
	        for(int i = low; i <= high ; i++)
	        {
	            for(int j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag)
	            {
	                System.out.println(i);
	            }
	        }
	    }
	}

