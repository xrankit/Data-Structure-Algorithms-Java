package February;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFBARBER {

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
		          long M = Integer.parseInt(Input[1]);
		          
		          if(N>0)
		          {
		              System.out.println(N*M);
		          }
		          else
		          {
		              System.out.println(N);
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
