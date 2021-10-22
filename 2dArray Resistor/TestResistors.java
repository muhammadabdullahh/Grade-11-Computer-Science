class TestResistors
{
	public static void main(String[] args)
	{
		Resistor[] group1 = {
			new Resistor(220),
			new Resistor(460),
			new Resistor(330),
			new Resistor(110)};
			
		for(Resistor r: group1)
		{
			System.out.print(r + " - ");
		}
		System.out.println();
		System.out.println("Resistance in Series: " + Resistor.getSerialResistance(group1));
		System.out.println("Resistance in Parralel: " + Resistor.getParallelResistance(group1));
	}
}
