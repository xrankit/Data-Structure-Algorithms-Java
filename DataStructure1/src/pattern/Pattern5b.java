package pattern;

import java.util.Scanner;

public class Pattern5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5
//	    
//		   
//		  *
//		 ***
//		*****
//		 ***
//		  *
		int n, i, j;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=0;i<n;i++)
	    {
		    for(j=0;j<n-i-1;j++){
	                     System.out.print(" ");
		    }
		    for(int k=0;k<2*i-3;k++){
			        System.out.print("*");
			}
			 System.out.println("");
		    }
		
		for(i=n-1;i>0;i--)
	    {
		    for(j=n-1;j>=i;j--){
	                     System.out.print(" ");
		    }
		   for(int k=2*i-5;k>0;k--){
			        System.out.print("*");
			}
			 System.out.println("");
		    }
	}

}
