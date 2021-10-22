public class Fraction implements Comparable<Fraction>
{
	
	int num;
	int den;
	
	//constructor
	public Fraction(int num, int den)
	{
		this();
		
		if (num > 0)
			this.num = num;
			
		if (den > 0)
			this.den = den;
	}
	
	public Fraction()
	{
		num = 0;
		den = 1;
	}
	
	//Accessor 
	public int getNum()
	{
		return num;
	}
	
	public int getDen()
	{
		return den;
	}
	
	//mutator
	public void setNum(int num)
	{
		this.num=num;
	}
	
	public void setDen(int den)
	{
		if (den > 0)
			this.den=den;
	}
	
	//to String
	@Override
	public String toString()
	{	
		return num + "/" + den;
	}
	 
	//Add funtion
	public Fraction add(Fraction other)
	{
		Fraction temp = new Fraction();
		
		int cd = commonDen(this.den, other.den);
		
		int num1 = ((this.num * (cd / this.den)) + (other.num * (cd / other.den)));
		int den1 = (cd);
		
		int gcd = reduceFrac(num1, den1);
		
		temp.setNum(num1 / gcd);
		temp.setDen(den1 / gcd);
		
		return temp;
	}
	
	//reduce fractions
	private static int reduceFrac(int a, int b)
	{
		if (b==0) return a;
			return reduceFrac(b,a%b);
	}
	
	//get common denominator
	private static int commonDen(int den1, int den2)
	{
		return den1 * den2;
	}
	
	public Fraction subtract(Fraction other)
	{
		Fraction temp2 = new Fraction();
		
		int cd = commonDen(this.den, other.den);
		
		int num1 = ((this.num * (cd / this.den)) - (other.num * (cd / other.den)));
		int den1 = (cd);
		
		int gcd = reduceFrac(num1, den1);
		
		temp2.setNum(num1 / gcd);
		temp2.setDen(den1 / gcd);
		
		return temp2;
	}
	
	public Fraction multiply(Fraction other)
	{
		Fraction temp3 = new Fraction();
		
		int num1 =this.num * other.num;
		int den1 =this.den * other.den;
		
		int gcd = reduceFrac(num1, den1);
		
		temp3.setNum (num1 / gcd);
		temp3.setDen (den1 / gcd);
		
		return temp3;
	}
	
	public Fraction divide(Fraction other)
	{
		Fraction temp4 = new Fraction();
		
		int num1 =this.num * other.den;
		int den1 =this.den * other.num;
		
		int gcd = reduceFrac(num1, den1);
		
		temp4.setNum (num1 / gcd);
		temp4.setDen (den1 / gcd);
		
		return temp4;
	}
	
	public void reduce() 
	{
	
		int gcd = reduceFrac(this.num,this.den);
		
		this.num = this.num / gcd;
		this.den = this.den / gcd;
	
	}
	
	
	public double doubleValue()
	{
		double a = (double) this.num;
		double b = (double) this.den;
		
		double value = a / b;
		
		return value;
	}
	
	public boolean equals(Fraction other)
	{
		double a = (double) this.num;
		double b = (double) this.den;
		double c = (double) other.num;
		double d = (double) other.den;
		
		if ((a/b) == (c/d))
			return true;
		else
			return false;
			
	}
	
	public int compareTo(Fraction other)
	{
		if(this.doubleValue() < other.doubleValue())
			return -1;
		if(this.doubleValue() > other.doubleValue())
			return 1;
		return 0;
		
	}
	
	
}

