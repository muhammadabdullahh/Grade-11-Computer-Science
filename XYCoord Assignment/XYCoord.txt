class XYCoord
{
	private int x;
	private int y;
	
	//CONSTRUCTOR METHDODS
	public XYCoord()
	{
		x = 0;
		y = 0;
	}
	public XYCoord(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public XYCoord(XYCoord other)
	{
		this.x = other.x;
		this.y = other.y;
	}
	
	//ACCESSOR METHODS
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	
	//MUTATOR METHODS
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	//INSTANCE METHODS
	public double distance(XYCoord other)
	{
		double x2 = other.x;
		double x1 = this.x;
		double y2 = other.y;
		double y1 = this.y;
		double answer = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		return answer;
	}
	
	//OVERRIDES
	@Override
	public String toString()
	{
		return "X = " + this.x + ", Y = " + this.y;
	}
	
	//OTHER METHODS
	public boolean equals(Object other)
	{
		if(this == other)
			return true;
	
		if(!(other instanceof XYCoord))
			return false;
		
		XYCoord c = (XYCoord)other;
	
		if(this.x == c.x && this.y == c.y)
			return true;
		
		return false;
	}
	
		
}
