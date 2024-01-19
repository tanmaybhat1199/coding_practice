import java.util.Scanner;

public class RecSum {
	public static void main(String[] args) {
//		int i = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the num");
//		int n = sc.nextInt();
//		show(1, n);
//		System.out.println();
//		int res=add(n);
//		System.out.println("Sum:" +res);
		int arr[]= {23,45,63,33,78,93};
		int res=count_3(arr);
		System.out.println("The count is"+res);
		dynamicAdd(arr, 3);
		int [][]tdarr=new int [3][2];
		System.out.println("the len"+tdarr.length);
		for(int i=0;i<tdarr.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				
			}
		}
		

	}

	static void show(int a, int n) {
		if (a < n) {
			System.out.print(a + " + ");
			a = a + 1;
			show(a, n);
		}
		
	}

	static int add(int b) {
		if (b <= 1)
			return b;

		return b + add(b - 1);

	}
	 
	
	static int count_3(int arr[])
	{
		String str="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			str+=arr[i];
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='3')
				count++;
		}
		
		return count;
	}

	static void dynamicAdd(int arr[],int target)
	{
		int brr[]=new int[arr.length+1];
		int j=0;
		for(int i=0;i<brr.length-1;i++)
		{
			brr[i]=arr[i];
		}
		for( j=brr.length-1;j>brr.length/2;j--)
		{
			brr[j]=brr[j-1];
		
		}
		brr[j]=target;
		for(int h:brr)
		{
			System.out.print(h+",");
		}
	}
	
	static int print_2D(int [][]arr,int rowlen,int collen)
	{
		
		if(collen>=3)
		{
			return 0;
		}
		if(rowlen>=2)
		{
			return 1;
		}
		System.out.println(arr[rowlen][collen]+" , ");
		if(print_2D(arr, rowlen, collen+1)==1)
			return 1;
		
		print_2D(arr, rowlen+1, 0)
		
		
	}
}