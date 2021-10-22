import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class HashAssignment
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What size hashtable would you like: ");
		int tableSize = in.nextInt();
		System.out.print("How many elements do you want to add: ");
		int elements = in.nextInt();
		String temp = "";
		
		HashSet<String> hs = new HashSet<String>(tableSize);
		
		for(int i = 0; i < elements; i++)
		{
			temp = "";
			for(int j = 0; j < 3; j++)
			{
				int rnd = (int) (Math.random() * 52); 
				char base = (rnd < 26) ? 'A' : 'a';
				temp = temp + (char) (base + rnd % 26);
				temp = temp.toUpperCase();
			}
			hs.add(temp);
		}
		
		for(int i = 0; i < tableSize; i++)
		{
			System.out.print(i + " :\t");
			Iterator<String> it = hs.iterator();
			while(it.hasNext())
			{
				temp = it.next();
				if(temp.hashCode() % tableSize == 1)
					System.out.print(temp + " , ");
			}
			System.out.println();
		}
	}	
}
