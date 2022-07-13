package February;

public class array {
	
	public static void calculateMinPrime(int k,int min)

	{

	if(k<=min)
	min = k;

	}

	public static int isPrime(int n)

	{

	int i,status=1;

	if(n<2) 
		status = 0;

	else

	{

	 for(i=2; i<=Math.sqrt(n); i++)

	 {

	  if(n%i == 0)

	  {

	   status = 0;

	   break;

	  }

	 }

	}

	return status;

	}
	
	public static int findSumOfPrimes(int[] input1, int input2)
	{
		int sum =0;
		int min = 0;
		int length = input2;
		for(int j=0; j<length; j++)

		{

		    if(isPrime(input1[j]) == 1) //checks if element is prime

		 { min = input1[j];

		 break;

		 }

		}

		for(int j=0; j<length; j++)

		{

		   if(isPrime(input1[j]) == 1) //checks if element is prime

		 {

		  sum += input1[j];

		  if(input1[j]<=min) min = input1[j];

		 }

		}

		  return (sum-min);

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int input1[] = {10,41,18,50,43,31,29,25,59,96,67};
		int input2 = input1.length;
		System.out.println(findSumOfPrimes(input1, input2));
	}

}
