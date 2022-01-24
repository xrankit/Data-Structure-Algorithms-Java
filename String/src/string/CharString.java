package string;

public class CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'c';
		String st = "ankityadav";
		String name = new String("AnkitYadav");
		String lName = "Yadav";
		String LaName = "Yadav";
//		String pool is nothing but a storage area in Java heap where string literals stores. It is also known as String Intern Pool or String Constant Pool. It is just like object allocation. By default, it is empty and privately maintained by the Java String class. Whenever we create a string the string object occupies some space in the heap memory.
//		Creating a number of strings may increase the cost and memory too which may reduce the performance also.
//		The JVM performs some steps during the initialization of string literals that increase the performance and decrease the memory load.
//		To decrease the number of String objects created in the JVM the String class keeps a pool of strings.
//		When we create a string literal, the JVM first check that literal in the String pool. If the literal is already present in the pool, it returns a reference to the pooled instance. If the literal is not present in the pool, a new String object takes place in the String pool.
		
//		by literal method is more optimize in java tha creating string by new keyword.
		
		String name1 = "Ankit Yadav";
		String name2 = "Ankit Yadav";
		String name3 = new String("Ankit Yadav");
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name2==name3);
		
//		true for first one because first it match with the previous value whether the value is occur or not.
//		false for second.
//		false for third.

		
	}

}
