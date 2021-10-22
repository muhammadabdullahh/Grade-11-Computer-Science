class Resistor
{
	private int resistance;
	
	
	public Resistor()
	{
		this.resistance = 0;
	}
	public Resistor(int resistance)
	{
		if(resistance > 0)
			this.resistance = resistance;
	}
	public Resistor(Resistor other)
	{
		this.resistance = other.resistance;
	}
	

	public int getResistance()
	{
		return this.resistance;
	}
	
	public void setResistance(int resistance)
	{
		if(resistance > 0)
			this.resistance = resistance;
	}
	
	public static double getSerialResistance(Resistor[] resistance)
	{
		double rT = 0;
		for(int i = 0; i < resistance.length; i++)
		{
			rT = rT + resistance[i].getResistance();
		}
		return rT;
	}
	
	public static double getParallelResistance(Resistor[] resistance)
	{
		double rT = 0;
		for(int i = 0; i < resistance.length; i++)
		{
			rT = rT + (1.0/resistance[i].getResistance());
		}
		rT = 1.0/rT;
		return rT;
	}
	
	@Override
	public String toString()
	{
		return "[Resistor] " + "Resistance = " + this.resistance + " ohms";
	}
}
	
	 
