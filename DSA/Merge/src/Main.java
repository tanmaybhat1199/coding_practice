
public class Main {

	public static void main(String[] args) {
		int arr[]= {12,23,43,56,78};
		int brr[]= {14,21,39,89,92,96};
		int [] crr=new int[arr.length+brr.length];
		Merge.Sort(arr, brr,crr);
		Merge.Disp(crr);

	}

}
