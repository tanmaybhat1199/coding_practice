package Company_Assignment;



public class Myclass {
  static int input[]=new int[20];


public static int count(int key)
{
	int low,high,cnt,mid;
	low=0;
	high=input.length-1;
	mid=(low+high)/2;
	while(input[mid]!=key && low>high)
	{
		if(key<input[mid])
		{
			high=mid-1;
		}
		else
			low=mid+1;
		
		mid=(low+high)/2;
		
	}
	if(input[mid]==key)
	{
		while()
		cnt=cnt+1;
	}
			
}
}
