public class HockeyPlayer extends Person implements Player
{
	private int goals;
	private int assists;
	
	public HockeyPlayer()
	{
		super();
	}
	
	public HockeyPlayer(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth)
	{
		super(name,yearOfBirth, monthOfBirth, dayOfBirth);
	}
	
	public HockeyPlayer(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth, int goals, int assists)
	{
		super(name,yearOfBirth, monthOfBirth, dayOfBirth);
		this.goals = goals;
		this.assists = assists;
	}
	
	public int getGoals()
	{
		return this.goals;
	}
	public int getAssists()
	{
		return this.assists;
	}
	
	public String respondToCoach()
	{
		return "YESS SIR / MAAM";
	}
	public String play()
	{
		return "Jump, Roll, 5 pushups, then shoot";
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Sport: Hockey| Goals: " + this.goals + " Assists: " + this.assists;
	}
	

}
