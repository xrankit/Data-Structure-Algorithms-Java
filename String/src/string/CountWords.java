package string;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Description: #### Given a string S, 
//		count number of words in the string.
//		Note : Assume there is single space between two words and 
//		there are no extra spaces before and after words.
		
		String str = "count number of words in the string";
		int totalCount = str.length();
		System.out.println("String with gap " +totalCount);
		int replace_gap = str.replace(" ","").length();
		System.out.println("total number of letters "+ replace_gap);
		int count = totalCount - replace_gap;
		System.out.println("number of gap "+count);
		
		
	}

}
