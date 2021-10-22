public class Rectangle extends Shape2D
{
	public Rectangle(int width, int height) //constructor
	{
		super(width, height);
	}
	
	public Rectangle() //constructor method
	{
		super();
		
	}
	
	public double area() //area instance method
	{
		return (double)this.getWidth() * (double)this.getHeight();
	}
	
	@Override
	public String toString()
	{
		return "[Rectangle] width: " + getWidth() + "   height: " + getHeight();
	}
}

