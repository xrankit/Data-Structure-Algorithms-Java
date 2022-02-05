package February;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EUREKA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			try 
			{
		          String[] Input = br.readLine().split(" ");
		          long N = Integer.parseInt(Input[0]);
		          
		          double ans = Math.pow((0.143*N),N);
		          //System.out.println(ans);
		          if((ans-Math.floor(ans))<0.5)
		          {
		              System.out.println((int)Math.floor(ans));
		          }
		          else
		          {
		              System.out.println((int)(Math.floor(ans)+1));
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
