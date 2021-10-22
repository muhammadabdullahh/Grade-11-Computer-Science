/*This program compares 5 sorting methods which include
 * bubble sort, insertion sort, selection sort, quick sort, 
 * and parallel/merge sort. As if now the default array size is 100,000,
 * but it an be changes by manually entering array sizes for
 * accending, decending and shuffled, all ranging from 0-99
 * FINALLY printing out the time it takes to sort for each method
 * in milliseconds
 * @Author Muhammad Abdullah
 * Date: January 6, 2021
 * */
 
import java.util.Arrays;

class SortComparison
{	
	public static void main(String[] args)		//MAIN METHOD
	{
		//VARIABLES
		long startTime = 0;
		long time = 0;
		
		//Arrays
		int[] accArray = new int[100000];
		int[] decArray = new int[100000];
		int[] shufArray = new int[100000];
		
		//FILLING ARRAYS
		for(int i = 0; i < accArray.length; i++)		//ACCENDING
		{
			accArray[i] = i;
		}
		int j = 0;
		for(int i = decArray.length - 1; i >= 0; i--)	//DECENDING
		{
			decArray[j] = i;
			j++;
		}
		for(int i = 0; i < shufArray.length; i++)		//SHUFFLED ARRAY (making the array)
		{
			shufArray[i] = i;
		}
		for(int i = 0; i < shufArray.length * 2; i++)
		{
			int rand1 = (int)(Math.random() * shufArray.length);	//SHUFFLED ARRAY (shiffling the array)
			int rand2 = (int)(Math.random() * shufArray.length);
			int temp = shufArray[rand1];
			shufArray[rand1] = shufArray[rand2];
			shufArray[rand2] = temp;
		}
		
		//Remove slashes to print out the arrays before sorted
		//System.out.println("Accending:\n" + Arrays.toString(accArray));
		//System.out.println("Decending:\n" + Arrays.toString(decArray));
		//System.out.println("Shuffled:\n" + Arrays.toString(shufArray));
		
		System.out.println();
		System.out.println("********** SORT RESULTS (in milliseconds) **********");
		System.out.println("\t\tBubble\tInsert\tSelect\tQuick\tParallel");
		System.out.print("Accending:\t");
		
		//PRINTING THE SORTED ARRAYS
		//***************ACCENDING******************
		startTime = System.currentTimeMillis();
		bubbleSort(Arrays.copyOf(accArray, accArray.length));		//Bubble Sort
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		insertionSort(Arrays.copyOf(accArray, accArray.length));	//Insertions Sort
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		selectSort(Arrays.copyOf(accArray, accArray.length));		//Selection Sort
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		Arrays.sort(Arrays.copyOf(accArray, accArray.length));		//Quick Sort
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		Arrays.parallelSort(Arrays.copyOf(accArray, accArray.length));	//Parralel Sort....All the same order for each array below
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		System.out.println();
		System.out.print("Decending:\t");
		
		//***************DECENDING*******************
		
		startTime = System.currentTimeMillis();
		bubbleSort(Arrays.copyOf(decArray, decArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		insertionSort(Arrays.copyOf(decArray, decArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		selectSort(Arrays.copyOf(decArray, decArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		Arrays.sort(Arrays.copyOf(decArray, decArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		Arrays.parallelSort(Arrays.copyOf(decArray, decArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		System.out.println();
		System.out.print("Shuffled:\t");
		
		//***************SHUFELLED*********************
		startTime = System.currentTimeMillis();
		bubbleSort(Arrays.copyOf(shufArray, shufArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		insertionSort(Arrays.copyOf(shufArray, shufArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		selectSort(Arrays.copyOf(shufArray, shufArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		Arrays.sort(Arrays.copyOf(shufArray, shufArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
		startTime = System.currentTimeMillis();
		Arrays.parallelSort(Arrays.copyOf(shufArray, shufArray.length));
		time = (System.currentTimeMillis() - startTime);
		System.out.print(time + "\t");
		
	}
	
	//*******************SORT METHODS********************
	
	public static void bubbleSort(int[] array)		//BUBBLE METHOD
	{
		boolean sorted = false;
		int temp;
		while(!sorted) 
		{
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) 
			{
				if (array[i] > array[i+1]) 
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorted = false;
				}
			}      
		}
	}
	public static void insertionSort(int[] list)	//INSERTION METHOD
	{
		for(int top = 1; top < list.length; top++) 
		{
			int item = list[top];				
			int i = top;							
			
			while(i > 0 && item < list[i - 1])		
			{
				//System.out.println("swap");
				list[i] = list[i - 1];				
				i--;								
			}
			list[i] = item;							
			//System.out.println("swap");							
		}
	}
	public static void selectSort(int[] list)		//SELECTION METHOD
	{
		for(int top = list.length - 1; top > 0; top--)
		{
			int largeLoc = 0;
			for(int i = 1; i <= top; i++)
			{
				if(list[i] > list[largeLoc])
				{
					largeLoc = i;
				}
			}
		
			int temp = list[top];
			list[top] = list[largeLoc];
			list[largeLoc] = temp;
		}
	}

	
}
