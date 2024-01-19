
public class Main {
	
	public static void main(String []args)
	{
		int arr[]={11,23,56,13,22,89,29,37,81};
		System.out.print("Before Sorting:");
		QuickSort.Disp(arr);
        QuickSort.Quicksort(arr);
        System.out.print("After Sorting:");
        QuickSort.Disp(arr);
        
	}

}
