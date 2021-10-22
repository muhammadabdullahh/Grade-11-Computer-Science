class TicTacToeBoard
{
	private TicTacToeSpace[][] spaces;
	
	public TicTacToeBoard()
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println();
			for(int e =0; e > 3 ;e++)
			{
				System.out.print("-  ");
			}
		}
	}
	public TicTacToeBoard(int[][] board)
	{
		this();
		for(int i = 0; i < spaces.length; i++)
		{
			for(int j = 0; i < spaces.length; i++)
			{
				spaces[i][j].setValue(board.getValue[i][j]());
			}
		}
	}

	/*public TicTacToeBoard(TicTacToeSpace[][] board)
	{
		
	}
	public TicTacToeBoard(TicTacToeBoard board)
	{
		
	}
	public boolean isWin()
	{
		
	}
	public boolean isDraw()
	{
		
	}
	public boolean isBlank()
	{
		
	}
	public boolean setSpace(int row, int col, int value)
	{
		
	}
	public TicTacToeSpace getSpace(int row, int col)
	{
		
	}
	public void clear()
	{
		
	}
	public String toString()
	{
		
	}*/
}

	
