public class TestPeople
{
	public static void main(String[] args)
	{
		
		Person p1 = new Person("Edward Scissorhands",1963,6,9);
		HockeyPlayer hp1 = new HockeyPlayer("Borje Salming",1951,4,15,148,620);
		HockeyPlayer hp2 = new HockeyPlayer("Sick Dude",2003,2,16);
		HockeyPlayerCoach hpc1 = new HockeyPlayerCoach("Reggie Dunlop",1925,1,26,7,12,30);
		
		System.out.println();
		System.out.println("Here are the Persons:");
		System.out.println(p1);
		System.out.println(hp1);
		System.out.println(hp2);
		System.out.println(hpc1);
		System.out.println();
		
		System.out.println("What does " + hp1.getName() + " do: " + hp1.play());
		System.out.println("What does " + hp1.getName() + " say: " + hp1.respondToCoach());
		System.out.println();
		
		System.out.println(hp2.getName() + " has " + hp2.getGoals() + " goals.");
		System.out.println();
		
		System.out.println(hpc1.getName() + " says \"" + hpc1.disciplinePlayer() + "\" when talking to " + hp2.getName() + ".");
		System.out.println(hpc1.getName() + " says " + hpc1.describePlay() + " to " + hp2.getName());
		System.out.println(hp2.getName() + " has " + hp2.getGoals() + " goals.");
		System.out.println();
		
		System.out.println(hpc1.getName() + " says: Coaching " + hp2.getName()  + 
			" makes me want to \"" + hpc1.disciplinePlayer() + "\".");
		System.out.println(hpc1.getName() + " tells himself: " + hpc1.describePlay());
		
		
	}
}
