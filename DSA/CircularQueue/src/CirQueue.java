
public class CirQueue {
	int arr[];
	int F;
	int R;
	
	public CirQueue() {
		 int arr[]=new int[5];
		 F=-1;
		 R=-1;
		
	}
	public void insert(int value)
	
	{
		if(F==R-1 && (F==0 || R==arr.length-1)) {
			System.out.println("Queue Is Full");
		}
		else
		{
			if(R!=arr.length-1)
				R++;
			else
				R=0;
			arr[R]=value;
			//Is this is the first insert value make f=0
			if(F==-1)
			{
				F++;
			}
				
			
		}
	}
	
	public int remove()
	{
		int val=0;
		if(F==-1)
		{
			System.out.println("Queue Is Empty");
		}
		else
		{
			val=arr[R];
			if(R==arr.length-1)
			{
				val=arr[R];
				R--;
				
			}
		}
		return val;
	}
	public void printQ()
	{
		int i=0;
		for(i=0;i<=F;i++)
		{
			System.out.print(arr[i]+",");
			
		}
				
	}

}
