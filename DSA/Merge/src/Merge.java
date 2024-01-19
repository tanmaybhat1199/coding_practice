
public class Merge {
	
	public static void Sort(int arr[],int brr[],int crr[])
	{
		int i=0,j=0,k=0;
		
		while(i<arr.length && j<brr.length)
		{
			if(arr[i]<brr[j])
			{
				crr[k]=arr[i];
				i++;
				k++;
				
			}
			else
			{
				crr[k]=brr[j];
				j++;
				k++;
			}
			
		}
		if(i==arr.length)
		{
			while(j<brr.length)
			{
				crr[k]=brr[j];
				k++;
				j++;
			}
		
			
		}
		else
		{
			while(i<brr.length)
			{
				crr[k]=brr[i];
				k++;
				i++;
			}
			
		}
		
	}
	public static void Disp(int []arr)
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
		System.out.println();
	}

}
