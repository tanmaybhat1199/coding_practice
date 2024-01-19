
public class QuickSort {
	
	public static int partition(int []p,int Lower,int Higher)
	{
		int i;
		int j=Lower;
		int k=Higher;
		i=Lower-1;
		while(j!=k)
		{
			if(p[j]<=p[k])
			{
				i++;
				int temp=p[i];
				p[i]=p[j];
				p[j]=temp;
				
			}
			j++;
		}
		i++;
		int temp=p[i];
		p[i]=p[j];
		p[j]=temp;
		
		return i;	
	}
	
	public static void Quicksort(int []arr)
	{
		Sort(arr,0,arr.length-1);
		
	}
	
	public static void Sort(int []arr,int Low,int high)
	{
		if(Low<high)
		{
		int	res=partition(arr, Low, high);
		Sort(arr,Low,res-1);
		Sort(arr,res+1,high);
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


