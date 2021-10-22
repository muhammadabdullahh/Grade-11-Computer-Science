class XYZCoord extends XYCoord
{
	private int z;
	
	//CONSTRUCTOR
	public XYZCoord()
	{
		super();
		this.z = 0;
	}
	public XYZCoord(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}
	public XYZCoord(XYZCoord other)
	{
		XYZCoord temp = new XYZCoord();
		setX(other.getX());
		setY(other.getY());
		this.z = other.z;
	}
	
	//ACCESSOR
	public int getZ()
	{
		return this.z;
	}
	
	//MUTATOR
	public void setZ(int z)
	{
		this.z = z;
	}
	
	@Override
	public String toString()
	{
		return  super.toString() + " Z = " + this.z;
	}
	
	//OTHER METHODS
	public boolean equals(Object other)
	{
		if(this == other)
			return true;
	
		if(!(other instanceof XYZCoord))
			return false;
		
		XYZCoord c = (XYZCoord)other;
	
		if(getX() == c.getX() && getY() == c.getY() && this.z == c.z)
			return true;
		
		return false;
	}
	
	public double distance(XYZCoord other)
	{
		double x2 = other.getX();
		double x1 = this.getX();
		double y2 = other.getY();
		double y1 = this.getY();
		double z1 = this.z;
		double z2 = other.z;
		double answer = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) + ((z2 - z1) * (z2 - z1)));
		return answer;
	}
	
}
