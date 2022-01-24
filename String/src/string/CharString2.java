package string;

public class CharString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it will store in the string pool      
		String str1 = "Python";  
		String str2 = "Data Science"; 
		
		//it returns the reference of the pooled instance i.e. str1  
		//it will not take place in the string pool  
		String str3 = "Python";  
		String str4 = "C";  
		
		//store in Java heap  
		String str5 = new String ("Java");  
		  
		String str6 = new String ("C++");  
		 
		String str7 = new String ("Data Science"); 
		
		//it will not take place in Java heap  
		//it will store in string pool  
		String str8 = new String ("C").intern();  
		
		//returns false  
		System.out.println((str1 == str5)+", Strings are not equal.");  
		
		//returns false because str2 occupies space in string pool and str7 occupies space in Java heap  
		System.out.println((str2 == str7)+", Strings are not equal.");   
		
		//it returns true because we have invoked the intern() method and the String C is already present in the string pool  
		System.out.println((str4 == str8)+", Strings are equal.");  
	}

}
