import java.util.Arrays;

public class Searching
{
	public static void main(String[] args)
	{
		long startTime = 0;
		double time = 0;
		
		
		//create an array of ints
		int[] values = new int[20000000];
		
		//fill array with random values in 0-9999999 range
		for(int i = 0; i < values.length; i++)
		{
			values[i] = (int)(Math.random() * 10000000);
		}
		
		//choose 100 random values to search for and print search results
		//Linear Search of unsorted array
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100; i++)
		{
			int rand = (int)(Math.random() * 10000000);
			System.out.print(linearSearch(values,rand) + ",");
		}
		time = (System.currentTimeMillis() - startTime) / 1000.0;
		System.out.println("\nLinear Search completed in " + time + "seconds\n\n");
		
		//sort the array
		Arrays.sort(values);
		
		//choose 100 random values to search for and print search results
		//Linear Search of sorted array
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100; i++)
		{
			int rand = (int)(Math.random() * 10000000);
			System.out.print(linearSearch(values,rand) + ",");
		}
		time = (System.currentTimeMillis() - startTime) / 1000.0;
		System.out.println("\nLinear Search completed in " + time + "seconds\n\n");
		
		//choose 100 random values to search for and print search results
		//Binary Search of sorted array
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100; i++)
		{
			int rand = (int)(Math.random() * 10000000);
			System.out.print(binarySearch(values, 0, values.length, rand) + ",");
		}
		time = (System.currentTimeMillis() - startTime) / 1000.0;
		System.out.println("\nBinary Search completed in " + time + "seconds\n\n");
		
	}
	
	
	public static int linearSearch(int[] array, int val)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == val)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int first, int last, int val)
	{		
		if (last >= first)
		{  
			int mid = first + (last - first)/2;  
            if (array[mid] == val)
            {  
				return mid;  
			}  
            if (array[mid] > val)
            {  
				return binarySearch(array, first, mid-1, val);	 
            }
            else
            {  
				return binarySearch(array, mid+1, last, val); 	
            }  
		}
			
		return -1;
	}
	
}		
