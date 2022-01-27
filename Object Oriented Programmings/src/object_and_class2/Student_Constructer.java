package object_and_class2;

public class Student_Constructer {
	
	public String Name;
	int age;
	private int rollNo;
	
	public Student_Constructer(String name, int rolN, int Age)
	{
		Name = name;
		rollNo = rolN;
		age = Age;
	}
	
	
	public void setRollNumber(int rn)
	{
		if(rollNo <=0)
		{
			return;
		}
		rollNo = rn;
	}
	
	public int getRollNumber()
	{
		return rollNo;
	}
	
}
