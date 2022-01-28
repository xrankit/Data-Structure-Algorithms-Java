package objects_class_keywords;

public class Student {
	String Name;
//	final data numbers can be initialized as soon as they are declared.
    private final int rollNo;
    
    private static int numStudents;

//    // Constructor 1
//    Student(int num)
//    {
//          rollNo = num;
//          Name = "abc";
//    }	

//    // Constructor 2
//    Student(int num, String name)
//    {
//          rollNo = num;
//          Name = name;
//    }
    
    public static int getNumStudents()
    {
    	 return numStudents;
    }
 // Constructor 3
   public Student(int rollNo, String Name)
    {
//	 this provide the reference address
//	 objects_class_keywords.Student@7d6f77cc printed in output
//	   hum ussi object ko call kr skte h using this keyword
//	   System.out.println(this);
          this.rollNo = rollNo;
          this.Name = Name;
          numStudents++;
    }
    
//    public void setRollNumber(int rn)
//    {
//    	if(rn<=0)
//    	{
//    		return;
//    	}
//    	rollNo = rn;
//    }
    
    public int getRollNumber()
    {
    	return rollNo;
    }
    
    public void print(){
            System.out.println(Name +" " + rollNo+" ");
    }

}

