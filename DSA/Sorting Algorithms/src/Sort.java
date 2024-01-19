
public class Sort {
	
	public static void SelectionS(int[] arr) {
		int i, j, x;
		i = 0;
		while (i != arr.length - 1) {
			j = i;
			x = arr[j];
			while (j < arr.length) {
				if (x < arr[j]) {
					int temp = arr[j];
					arr[j] = x;
					x = temp;
				}
				j++;
			}
			arr[i] = x;
			i++;

		}
	}
	
	
	public static void BubbleS(int arr[]) {
		int i=0,j;
		while(i<arr.length)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			i++;
		}
	}
	public static void InsertionDescending(int[] arr) {
		int i = 0, j, temp;
		for (j = 1; j < arr.length; j++) {
			i = j;
			while (i > 0) {
				if (arr[i] > arr[i - 1]) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					i--;
				} else
					break;
			}
		}
	}
	
	public static void InsertionS(int arr[])
	{
		int i=0,j;
		for(i=1;i<arr.length;i++)
		{
			j=i;
			while(j > 0)
			{
				if(arr[j] < arr[j-1])
				{
			       int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					j--;
				}
				else
				{break;}
			}
 			
		}
	}
	
	
	public static void print(int arr[])
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
		}
		System.out.println("");
	}



  public static int partioning(int arr[],int l,int h)
  {
	  int i;
	  int j=l;
	  int p=h;
	  i=l-1;
	  while(j != p)
	  {
		  if(arr[j]<arr[p])
		  {
			  i++;
			  int temp=arr[j];
			  arr[j]=arr[i];
			  arr[i]=temp;
		  }
		  j++;
	  }
	  i++;
	  int tmp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=tmp;
	  
	  return i;
	  
  }
  
  public static void QuickSort(int []arr)
  {
	Sort(arr,0,arr.length-1);
  }
  
  private static void Sort(int[]arr,int l,int h)
  {
		
		if (l < h) {
			int res = partioning(arr, l, h);
			Sort(arr,l,res-1);
			Sort(arr,res+1,h-1);

		}
	}
}