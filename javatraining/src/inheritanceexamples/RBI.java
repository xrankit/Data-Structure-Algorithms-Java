package inheritanceexamples;

public class RBI {
	
	
	 private final int salary;
	 
	 // Constructor 3
	   public RBI(int salary)
	    {

	          this.salary = salary;
	    }

	    
	    public int getRollNumber()
	    {
	    	return salary;
	    }
	    
	    void check( private final int rollNo;
    
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
    }ll)
}
