 package objects_and_classes;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for class student
		Student s1 = new Student();
		s1.name ="Ankit";
		s1.rollNo = 120016;
		s1.age = 20;
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(s1.age);
		
		Student s2 = new Student();
		s2.name ="Ayush";
		s2.rollNo = 120029;
		s2.age = 20;
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		System.out.println(s2.age);
		
//		for class student1
		
		Student1 st1 = new Student1();
		st1.name ="Ankit";
//		st1.rollNo = 120016;
		st1.setRollNo(120016);
		st1.age = 20;
		System.out.println(s1.name);
//		System.out.println(s1.rollNo);
		System.out.println(st1.getRollNo());
		System.out.println(s1.age);
		
		Student1 st2 = new Student1();
		st2.name ="Ayush";
//		st2.rollNo = 120029;
		st2.setRollNo(-120029);
		st2.age = 20;
		System.out.println(s2.name);
//		System.out.println(s2.rollNo);
		System.out.println(st2.getRollNo());
		System.out.println(s2.age);
		
	}

}
