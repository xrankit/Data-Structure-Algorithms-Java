package objects_class_keywords;

import object_and_class2.Students;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "ankit");
        s1.print();
//        System.out.println(s1);
//        System.out.println(s1.Name);
//        System.out.println(s1.getRollNumber());
        Student s2 = new Student(150, "ayush");
        s2.print();
//        System.out.println(s2);
//        System.out.println(s1.Name);
//        System.out.println(s1.getRollNumber());
        
//        when we have static data member and we have to call
//        from any data students s1 or s2 we get the same value.
        System.out.println(s1.getNumStudents());
        System.out.println(s2.getNumStudents());
        }

}
