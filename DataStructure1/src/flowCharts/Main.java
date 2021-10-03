package flowCharts;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i = 0;i<t;i++)
    {
        boolean temp = true;
        int n = scn.nextInt();
        for(int j = 2; j<n;j++)
        {
            if(n % j==0)
            {
                temp=false;
                break;
            }
        }
        if(temp)
        {
            System.out.println("prime");
        }
        else
        {
            System.out. println("not prime");
        }
    }
 }
}