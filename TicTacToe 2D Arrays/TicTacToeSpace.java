class TicTacToeSpace
{
	private int value;
	public static final int BLANK = 0;
	public static final int X = 1;
	public static final int O = 2;
	
	public TicTacToeSpace()
	{
		this.value = 0;
	}
	public TicTacToeSpace(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return this.value;
	}
	public void setValue(int value)
	{
		if(value == 1 || value == 2)
			this.value = value;
	}
	public String getValueString()
	{
		return this.toString();
	}
	
	@Override
	public String toString()
	{
		return "" + this.value;
	}
}
