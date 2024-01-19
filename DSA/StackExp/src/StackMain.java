
public class StackMain {
	static int TopIndex=-1;
	static int []arr;
	public static void main(String []args) {
		arr = new int[5];
		push(12);
		push(7);
		
		push(6);
		push(1);
		push(9);
		push(8);
		
		disp();
		
	}
	
	static void push(int n) {
		if(TopIndex < arr.length-1)
		{
			TopIndex++;
			arr[TopIndex]=n;
		}
		else
		{
			System.out.println("OverFlow");

		}
	}
	
	static int pop() {
		if(TopIndex != 1)
		{
			int a= arr[TopIndex];
			TopIndex--;
			return a;
			
		}
		else {
			System.out.println("Underflow");
			return 0;
		}
	}
	
	static void disp() {
		if(TopIndex==-1)
		{
			System.out.println("Stack Is Empty");
		}
		else {
		for(int i=TopIndex;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
			
		}
	}


}
