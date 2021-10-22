import java.util.LinkedList;

class LinkedListAssignment
{
	public static void main(String[]args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Mark");
		ll.add("Jocelyn");
		ll.add("Carl");
		ll.add("Emily");
		ll.add("Bob");
		ll.add("Josh");
		ll.add("Harmony");
		ll.add("Olivia");
		ll.add("Mo");
		ll.add("Conor");
		
		int size = ll.size();
		int temp  = 9;
		while(ll.size() > 1)
		{
			System.out.println(ll.get(temp % ll.size()) + " was fired");
			ll.remove(temp % ll.size());
				
		} 
		System.out.println(ll + " has won");
	}
}
