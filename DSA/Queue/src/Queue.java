import java.util.Scanner;

public class Queue {
    int arr[];
	int F;
	int r;
    Scanner sc =new Scanner(System.in);
	public Queue() {
		System.out.println("Enter The Size Of Queue");
		int size =sc.nextInt();
		arr = new int[size];
		F = -1;
		r = -1;
	}
	public Queue(int len)
	{
		arr= new int[len];
		F = -1;
		r = -1;
	}

	public void insert(int value) {
		if (this.r < this.arr.length - 1) {
			this.r++;
			this.arr[r] = value;
		
		if (this.F == -1)
			this.F++;
		}
		else 
			System.out.println("Queue Is Full");
		
	}

	public int remove() {
		if (this.F == -1 && this.r == -1) {
			System.out.println("Queue Is Empty");
		}
		int value = this.arr[this.F];
		if (this.F != this.r)
			this.F++;
		else
			this.F = this.r = -1;
		return value;

	}

	public String toString() {
		String str = "";
		if (this.F == -1) {
			str += "Queue is empty";
		} else {

			for (int i = this.F; i <= this.r; i++) {
				str = str + arr[i] + ",";
			}

		}
		return str;
	}
	public Queue concat(Queue k)
	{
		Queue res = new Queue(this.arr.length+k.arr.length);
		for(int i=0;i<3;i++)
		{
			res.insert(this.arr[i]);
		
			
		}
		for(int i=0;i<3;i++)
		{
			res.insert(k.arr[i]);
		}
		return res;
		
	}
}
