
public class CircularQ {
	private int arr[];
    private int F,R;
	
	public CircularQ(int s) {
		arr=new int[s];
		F=-1;
		R=-1;
		
	}
	public CircularQ()
	{
		arr=new int[5];
		F=-1;
		R=-1;
	}
	
	public void InsertFirst(int value) {
		if (R+1==F  || (F == 0 && R == arr.length - 1) ){
			System.out.println("The Circular Queue Is Full");

		} 
		else {
			if (R != arr.length - 1) {
				R++;
				
			}
			else
				R=0;
			
		    arr[R] = value;
			if (F == -1) {
				F++;
			}

		}

	}
	
	
	public int Delete()
	{
		int del=0;
		if(F==-1 || R==-1)
		{
			System.out.println("The Queue Is Empty");
		}
		else
		{
			if(F != R)
			{
				del=arr[F];
				if(F != arr.length-1)
				F++;
				else 
				F=0;
				
			}
			else
				F=R=-1;
		}
		
		return del;
	}
	
	public void Display()
	{
		int i=0;
		for(i=F;i<=R;i++)
		{
			System.out.print(arr[i]+",");
			
		}
				
	}

}
