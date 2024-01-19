
public class Sort {
	
	public static void SelectionAscending(int[] arr) {
		int i, j, k;
		int temp = 0;
		for (i = 0; i < arr.length; i++) {
			j = i;
			k = arr[j];
			while (j < arr.length) {
				if (arr[j] < k) {
					temp = arr[j];
					arr[j] = k;
					k = temp;
				}
				j++;

			}
			arr[i] = k;
		}
	}
	public static void SelectionDescending(int[] arr) {
		int i, j, k;
		int temp = 0;
		for (i = 0; i < arr.length; i++) {
			j = i;
			k = arr[j];
			while (j < arr.length) {
				if (arr[j] > k) {
					temp = arr[j];
					arr[j] = k;
					k = temp;
				}
				j++;

			}
			arr[i] = k;
		}
	}

	public static void InsertionDescending(int[] arr) {
		int i = 0, j, temp;
		for (j = 1; j < arr.length; j++) {
			i = j;
			while (i > 0) {
				if (arr[i] < arr[i - 1]) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					i--;
				} else
					break;
			}
		}
	}
	public static void InsertionAscending(int[] arr) {
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
	
	public static void display(int []arr)
	{
		int j;
		for (j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j]+ ",");
		}
		System.out.println();
	}

}
