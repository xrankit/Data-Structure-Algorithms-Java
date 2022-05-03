package object_class;

public class complexNumberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complexNumber c1 = new complexNumber(2,3);
		c1.print();
		
		c1.setReal(6);
		c1.setImaginary(8);
		c1.print();
		
		complexNumber c2 = new complexNumber(1,6);
		c1.add(c2);
		c1.print();
		c2.print();
		
		complexNumber c3 = new complexNumber(3,9);
		c3.multiply(c2);
		c3.print();
		c2.print();
		
		
	}

}
