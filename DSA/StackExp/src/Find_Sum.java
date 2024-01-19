
public class Find_Sum {
	public static void main(String[] args) {
		int arr[]= {12,34,56,78,54,23};
		int res=sumArray(arr, arr.length-1);
		System.out.println(res);
		
		int res2=factorial(5);
		System.out.println(res2);
	}
	
	public static int sumArray(int []a,int len)
	{
		if(len<0)
		{
			return 0;
		}
		return (a[len]+sumArray(a, len-1));
	}
	
	public static int factorial(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		return (num * factorial(num-1));
	}

}
