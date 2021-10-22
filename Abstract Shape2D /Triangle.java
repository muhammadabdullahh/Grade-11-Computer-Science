public class Triangle extends Shape2D
{
	
	public Triangle()
	{
		super();
	}
	
	public Triangle(int width, int height)
	{
		super(width, height);
	}
	
	public double area()
	{
		return (double)this.getWidth() * this.getHeight() / 2.0;
	}
	
	@Override
	public String toString()
	{
		return "[TRIANGLE] width: " + getWidth() + "   height: " + getHeight();
	}
	
}
