package object_class;

public class Fraction {
	
	private int numerator;
	private int denominator;
	

	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		if(denominator==0)
		{
			return;
		}
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int n)
	{
		numerator = n;
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public void setDenominator(int m)
	{
		if(m==0)
		{
			return;
		}
		denominator = m;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public void print()
	{
		System.out.println(this.numerator+" / "+this.denominator);
	}
	
	private void simplify()
	{
		int gcd =1;
		int small = Math.min(numerator, denominator);
		for(int i = 2;i <= small; i++)		
		{
			if(numerator%i==0 && denominator%i==0)
			{
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void add(Fraction f2)
	{
		this.numerator =  (this.numerator*f2.denominator)+(this.denominator*f2.numerator);
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public void multiply(Fraction f2)
	{
		this.numerator =  this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2)
	{
		int newNumerator = (f1.numerator*f2.denominator)+(f1.denominator*f2.numerator);
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f = new Fraction(newNumerator, newDenominator);
		return f;
	}
	
}
