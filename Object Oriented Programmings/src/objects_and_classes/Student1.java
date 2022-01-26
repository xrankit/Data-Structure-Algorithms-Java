package objects_and_classes;

public class Student1 {
	public String name;
	private	int rollNo;
	 int age;
	
	public void setRollNo(int rn)
	{
		if(rn<=0)
		{
			return;
		}
		rollNo = rn;
	}
	
	public int getRollNo() 
	{
		return rollNo;
	}

}
