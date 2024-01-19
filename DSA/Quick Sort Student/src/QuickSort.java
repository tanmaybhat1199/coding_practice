
public class QuickSort {
	
	public static int partitionForAge(Student []p,int Lower,int Higher)
	{
		int i;
		int j=Lower;
		int k=Higher;
		i=Lower-1;
		while(j!=k)
		{
			if(p[j].getAge()<=p[k].getAge())
			{
				i++;
				int temp=p[i].getAge();
				p[i].setAge(p[j].getAge());
				p[j].setAge(temp);;
				
			}
			j++;
		}
		i++;
		int temp=p[i].getAge();
		p[i].setAge(p[j].getAge());
		p[j].setAge(temp);
		
		return i;	
	}
	
	public static void QuicksortByAge(Student []arr)
	{
		Sort(arr,0,arr.length-1);
		
	}
	
	public static void Sort(Student []arr,int Low,int high)
	{
		if(Low<high)
		{
		int	res=partitionForAge(arr, Low, high);
		Sort(arr,Low,res-1);
		Sort(arr,res+1,high);
		}
		
	}
	
	public static void display(Student []p)
    {
    	System.out.println("------------------------------");
    	for(int i=0;i<p.length-1;i++)
    	{
    		System.out.println(p[i]);
    	}
    	System.out.println();
    }

	
	}


