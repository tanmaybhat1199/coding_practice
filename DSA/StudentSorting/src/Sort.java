
public class Sort {
	
	
	public static void byAgeDescending(Student[] arr) {  //Selection Sort Descending
		int i, j;
		Student k;
		Student temp = null;
		for (i = 0; i < arr.length; i++) {
			j = i;
			k = arr[j];
			while (j < arr.length) {
				if (arr[j].getAge() < k.getAge()) {
					temp = arr[j];
					arr[j] = k;
					k = temp;
				}
				j++;

			}
			arr[i] = k;
		}
	}
	public static void byAgeAscending(Student[] arr) {
		int i, j;
		Student k;
		Student temp = null;
		for (i = 0; i < arr.length; i++) {
			j = i;
			k = arr[j];
			while (j < arr.length) {
				if (arr[j].getAge() > k.getAge()) {
					temp = arr[j];
					arr[j] = k;
					k = temp;
				}
				j++;

			}
			arr[i] = k;
		}
	}

	public static void SortNameDescending(Student[] arr) { //Insertion Sort By Name
		int i = 0, j;
		Student temp;
		for (j = 1; j < arr.length; j++) {
			i = j;
			while (i < 0) {
				if ((arr[i].getName().compareTo(arr[i-1].getName()) > 0)) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					i--;
				} else
					break;
			}
		}
	}
	public static void SortNameAscending(Student[] arr) {
		int i = 0, j;
		Student temp;
		for (j = 1; j < arr.length; j++) {
			i = j;
			while (i < 0) {
				if (arr[i].getName().compareTo(arr[i - 1].getName()) <0) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					i--;
				} else
					break;
			}
		}
	}
	
	public static void display(Student []arr)
	{
		System.out.print("---------------------");
		int j;
		for (j = 0; j < arr.length; j++)
		{
			System.out.print(arr[j].toString());
		}
		System.out.println();
	}
}
	
