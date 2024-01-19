
public class Stack {
	private int []arr;
	private int top;

	public Stack() {
		arr=new int[5];
		top=-1;
		
	}

	public Stack(int sz) {
		arr=new int[sz];
		top=-1;
		
	}
	public void push(int val)
	{
		if(top < arr.length-1)
		{
			top++;
			arr[top]=val;
		}
		else
			System.out.println("Stack Is Overflow");
		
		
	}
	public int pop()
	{
		if(top != -1)
		{
			int value=arr[top];
			top--;
			return value;
		}
		else
			System.out.println("Stack is underFlow");
		return 0;
	}
	
	public String toString()
	{
		String str = new String();
		for(int i=top;i>=0;i--) {
			
			str= str + arr[i]+ ",";
		}
		return str;
	}
	
	public Stack concate(Stack s)
	{
		int cnt=0;
		Stack t = new Stack(this.arr.length+ s.arr.length);
		for(int i=0;i<=this.top;i++)
		{
			t.push(this.arr[i]);
			cnt++;
			
		}
		for(int i=0;i<= s.top;i++)
		{
			t.push(s.arr[i]);
		}
		return t;
	}
	
	public boolean equal(Stack s)
	{
		if(this.arr.length != s.arr.length)
		{
			if(this.top != s.top)
			{
			for(int i=0;i<=this.top;i++)
			{
				for(int j=0;j<=s.top;j++)
				{
				  this.arr[i]=s.arr[j];	
				}
			}
			
		}
			return true;
		
	}
		else
			return false;
	}
		
}
