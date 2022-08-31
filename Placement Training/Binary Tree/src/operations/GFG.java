package operations;


import java.util.*;
import java.io.*;
  
class GfG
{
	public static int minimumSwaps(int[] a, int n) {
		  HashMap <Integer,Integer> m = new HashMap<Integer,Integer>();
		  int[] copy = new int[n];
		  for (int i = 0; i<n; i++) {
		    copy[i] = a[i];
		  }
		  Arrays.sort(copy);
		  for (int i = 0; i< n; i++) {
		    m.put(copy[i], i + 1);
		  }
		  int moves = 0;
		  for (int i = 0; i<n; i++) {
		    if ((i + 1) != (int) m.get(a[i])) {
		      int temp = a[i];
		      int pos = m.get(a[i]) - 1;
		      a[i] = a[pos];
		      a[pos] = temp;
		      moves++;
		    }
		  }
		  return moves;
		}
  
    // Driver program to test the above function
    public static void main(String[] args)
    {
        int []a = {3, 2, 1};
       int n = a.length;
        System.out.println(minimumSwaps(a, n ));
    }
}

