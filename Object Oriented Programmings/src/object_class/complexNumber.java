package object_class;

public class complexNumber 
{
	private int real;
	private int imaginary;
	
	public complexNumber(int real, int imaginary)
	{
		this.real = real;
		this.imaginary=imaginary;
	}
	
	public void setReal(int n)
	{
		real = n;
	}
	
	public int getReal()
	{
		return real;
	}
	
	public void setImaginary(int m)
	{
		imaginary = m;
	}
	
	public int getImaginary()
	{
		return imaginary;
	}
	
	public void print()
	{
		if(imaginary >0)
		{
			System.out.println(this.real + " + "+this.imaginary+"i");
		}
		else if(imaginary <0)
		{
			System.out.println(this.real + " +("+this.imaginary+"i)");
		}
		else
		{
			System.out.println(this.real + " + "+this.imaginary+"i");
		}
	}
	
	public void add(complexNumber c2)
	{
		this.real =  (this.real + c2.real);
		this.imaginary = this.imaginary + c2.imaginary;
	} 
	
	public void multiply(complexNumber c2)
	{
		this.real = ((this.real*c2.real)-(this.imaginary*c2.imaginary));
		this.imaginary = ((this.real*c2.imaginary)+(this.imaginary*c2.real));
	}
	
	public void Conjugate()
	{
		this.real = this.real;
		this.imaginary = -(this.imaginary);
	}
	
	public void addComplexNumber(complexNumber c1, complexNumber c2)
	{
		this.real = c1.real + c2.real;
		this.imaginary = c1.imaginary + c2.imaginary;
	}
}
