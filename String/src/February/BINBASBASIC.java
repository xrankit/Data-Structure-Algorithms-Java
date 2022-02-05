package February;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BINBASBASIC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			try 
			{
			      int count =0;
		          String[] Input = br.readLine().split(" ");
		          int N = Integer.parseInt(Input[0]);
		          int K = Integer.parseInt(Input[1]);
		          
		          String str = br.readLine();
		          for(int i =0;i<N/2;i++)
		          {
		               if (str.charAt(i) != str.charAt(N-i-1))
		               {
		                   count = count +1;
		               }
		          }
		          
		          if(K>=count)
		          {
		              if((K-count)%2==0)
		              {
		                  System.out.println("YES");
		              }
		              else if(N%2!=0)
		              {
		                  System.out.println("YES");
		              }
		              else
		              {
		                  System.out.println("NO");
		              }
		          }
		          else
		          {
		               System.out.println("NO");     
		          }
		          
			}
			catch (IOException ex)
		   {
		        throw new RuntimeException(ex);
		    }
		  t--;
		}
	}

}
