package object_and_class2;

public class StudentUse_Constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Constructer s1 = new Student_Constructer("ankit",21,0016);
		
		//all print null and zero value because we did not pass anything to this.
		System.out.println(s1.Name);
		System.out.println(s1.getRollNumber());
		System.out.println(s1.age);
		
//		after passing the value to the following variables then
//		it print the values according to the values.
		s1.Name = "Ankit Yadav";
		s1.age = 21;
		s1.setRollNumber(290120016);
		System.out.println(s1.Name);
		System.out.println(s1.getRollNumber());
		System.out.println(s1.age);
		
		Student_Constructer s2 = new Student_Constructer("Ayush",20,120029);
		System.out.println(s2.Name);
		System.out.println(s2.getRollNumber());
		System.out.println(s2.age);
		
		s2.Name = "Ayush Srivastava";
		s2.age = 20;
		s2.setRollNumber(290120029);
		System.out.println(s2.Name);
		System.out.println(s2.getRollNumber());
		System.out.println(s2.age);
	}

}
