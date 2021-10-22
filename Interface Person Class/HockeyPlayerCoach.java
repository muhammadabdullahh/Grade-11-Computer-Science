public class HockeyPlayerCoach extends Person implements Player, Coach
{
	private int goals;
	private int assists;
	private int gamesCoahced;
	
	public HockeyPlayerCoach()
	{
		super();
	}
	
	public HockeyPlayerCoach(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth)
	{
		super(name,yearOfBirth, monthOfBirth, dayOfBirth);
	}
	
	public HockeyPlayerCoach(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth, int goals, int assists, int gamesCoahced)
	{
		super(name,yearOfBirth, monthOfBirth, dayOfBirth);
		this.goals = goals;
		this.assists = assists;
		this.gamesCoahced = gamesCoahced;
	}
	
	public int getGoals()
	{
		return this.goals;
	}
	public int getAssists()
	{
		return this.assists;
	}
	public int getGamesCoached()
	{
		return this.gamesCoahced;
	}
	
	public String respondToCoach()
	{
		return "Yess Sir";
	}
	public String play()
	{
		return "Holla at me an its a bardownski";
	}
	public String describePlay()
	{
		return "Pick up the puck, give it a kiss, pass it, then pass to";
	}
	public String disciplinePlayer()
	{
		return "Now go to the corner of the box and give yourself a couple punches in the face";
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "Sport: Hockey| Goals: " + this.goals + " Assists: " + this.assists + " Games Coaches: " + this.gamesCoahced;
	}
	

}
