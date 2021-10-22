abstract class Shape2D
{
	private int height;
	private int width;
	
	public Shape2D()
	{
		this.height = 1;
		this.width = 1;
	}
	public Shape2D(int height, int width)
	{
		if(height > 0 && width > 0)
		{
			this.height = height;
			this.width = width;
		}
		else 
		{
			this.height = 1;
			this.width = 1;
		}
	}
	
	//ACCESSORS
	public int getHeight()
	{
		return this.height;
	}
	public int getWidth()
	{
		return this.width;
	}
	
	//MUTATORS
	public void setHeight(int height)
	{
		if(height > 0)
			this.height = height;
	}
	public void setWidth(int width)
	{
		if(width > 0)
			this.width = width;
	}
	
	//OTHER
	public double area()
	{
		return ((double)this.width * (double)this.height); 
	}
}
