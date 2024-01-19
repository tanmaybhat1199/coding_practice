 
public class MergeSort {
	
	public static void Merge(int arr[],int Low,int Mid,int High)
	{
		int Size1=Mid-Low+1;
		int Size2=High-(Mid);
		int Brr[]=new int[Size1];
		int Crr[]=new int[Size2];
		for(int i=0;i<Brr.length;i++)
		{
			Brr[i]=arr[Low+i];
		}
		for(int i=0;i<Crr.length;i++)
		{
			Crr[i]=arr[Mid+1+i];
		}
		int i=0;
		int j=0;
		int k=Low;
		while(i<Brr.length && j<Crr.length) {
			if(Brr[i]<=Crr[j]) {
				arr[k]=Brr[i];
				k++;
				i++;
			}
			else
			{
				arr[k]=Crr[j];
				k++;
				j++;
				
			}
		}
		if (j == Crr.length) {
			while (i < Brr.length) {
				arr[k] = Brr[i];
				k++;
				i++;
			}
		} else {
			while (j < Crr.length) {
				arr[k] = Crr[j];
				k++;
				j++;
			}
		}
	}
	public static void mergeSort(int[] arr, int l,int h)
	{
		if(l<h)
		{
			int m = (l+h)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, h);
			
			Merge(arr, l, m, h);
			
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
