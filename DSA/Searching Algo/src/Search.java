import java.util.Scanner;
//Binary Search Algorithm.

public class Search {
	int arr[];
	
	public Search(int size)
	{
		arr=new int[size];
	}
	
	public void AcceptArr()
	{
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter The Element"+(i+1));
			int num=sc.nextInt();
			arr[i]=num;
		}
	}
	
	public int Search(int key)
	{
		int Low=0;
		int high=arr.length-1;
		int mid=(Low+high)/2;
		while(arr[mid] != key )
		{
			if(key<arr[mid])
				high=mid-1;
			else
				Low=mid+1;
			
			mid=(Low+high)/2;
		}
		if(arr[mid]==key)
		{
			return mid+1;
		}
		else
			return -999;
				
			
				
	}
	public void Print()
	{
		for(int i=0;i<arr.length;i++)
		{
	      System.out.print(arr[i]+",");
		}
		System.out.println();
	}

}
