package string;

public class CharString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ankit";
//		String name = "Yadav";
//		this string store name as "Yadav" but initially it store "Ankit"
//		that is not removed.
		String names = "Ankit Yadav";
		System.out.println(names.charAt(4));
		System.out.println(names.length());
		System.out.println(names.substring(1,6));
		System.out.println(names.substring(5));
		
	}

}
