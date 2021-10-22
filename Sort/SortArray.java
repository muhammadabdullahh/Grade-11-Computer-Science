class SortArray
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{5,6,7,1,3,9};
		
		for(int e = 0; e < arr.length; e++)
		{
			System.out.print(arr[e]);
		}
		
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  
		} 
		
		System.out.println();
		for(int g = 0; g < arr.length; g++)
		{
			System.out.print(arr[g]);
		}
	}
}
				
		
