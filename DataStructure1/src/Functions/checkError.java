package Functions;

public class checkError {
	public static void func(int a) {
        int b = 10;
        a = a + 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        func(a);
        System.out.println(a);
    }
}


