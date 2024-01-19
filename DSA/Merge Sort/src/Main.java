
public class Main {

	public static void main(String[] args) {
		int []arr= new int[]{10,234,67,89,63,7,42,67};
		System.out.print("Before Sorting:");
		MergeSort.Disp(arr);
		MergeSort.mergeSort(arr, 0, arr.length-1);
		System.out.print("After Sorting:");
		MergeSort.Disp(arr);

	}

}
