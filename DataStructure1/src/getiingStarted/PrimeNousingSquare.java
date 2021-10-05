package getiingStarted;

import java.util.Scanner;
public class PrimeNousingSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        int low = sc.nextInt();
	        int high = sc.nextInt();
	        for(int i = low; i <= high ; i++)
	        {
	           int flag = 0;
	            for(int j=2;j*j<=i;j++)
	            {
	                if(i%j==0)
	                {
	                    flag++;
	                    break;
	                }
	            }
	            if(flag==0)
	            {
	                System.out.println(i);
	            }
	        }
	}

}
