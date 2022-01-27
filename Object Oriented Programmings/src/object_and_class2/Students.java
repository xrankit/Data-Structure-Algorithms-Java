package object_and_class2;

public class Students {
	String name;
    int rollNo;

    // Constructor 1
    Students(int num)
    {
          rollNo = num;
          name = "abc";
    }	

    // Constructor 2
    Students(int num, String name)
    {
          rollNo = num;
          name = "str";
    }

    public void print(){
            System.out.print(name +" " + rollNo+" ");
    }

	}
		
