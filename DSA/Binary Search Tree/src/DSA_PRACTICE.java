import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DSA_PRACTICE {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	int arr[]= {12,7,35,53,14,19};
    bubbleSort(arr);
    for(int i:arr)
    {
    	System.out.print(i+",");
    }
	
//	al.add(13);
//	al.add(45);
//	al.add(56);
//	al.add(60);
//	System.out.println(al);
//	
//	List<Integer> l1;
//	l1=al.stream().filter(e->e%2==0).collect(Collectors.toList());
//	System.out.println(l1);
//	List<Integer> l2=al.stream().map((e)->e*2).collect(Collectors.toList());
//	System.out.println(l2);

	}
	
	
	
	public static void bubbleSort(int arr[])
	{
		int i=0;
		int j=0;
		int count=0;
		while(i<arr.length)
		{
	
			for( j=0;j<arr.length-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			
					count++;
				}
				i++;
			
		}
		System.out.println(count);
	}

}
