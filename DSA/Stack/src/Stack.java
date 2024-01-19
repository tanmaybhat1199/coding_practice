
public class Stack {
	private Student[] arr;
	private int top;

	public Stack() {
		this.arr = new Student[5];
		this.top = -1;
	}

	public Stack(int n) {
		this.arr = new Student[n];
		this.top = -1;
	}

	public void push(Student val) {
		if (this.top < arr.length - 1) {
			top++;
			this.arr[this.top] = val;
		} else {
			System.out.println("OverFlow");

		}
	}

	public Student pop() {
		if (this.top != -1) {
			Student a = arr[this.top];
			top--;
			return a;
		}

		else {
			System.out.println("Underflow");
			return null;
		}
	}

	public String toString() {
		String str = new String();
		if (this.top == -1) {
			System.out.println("Stack is Empty");
		} else {
			for (int i = this.top; i >= 0; i--) {
				str = str + arr[i] + ",";

			}

		}
		return str;
	}

	public Stack concate(Stack s) {
		Stack st = new Stack(this.arr.length + s.arr.length);
		for (int i = 0; i <= this.top; i++) {
			st.push(this.arr[i]);

		}
		for (int i = 0; i <= s.top; i++) {
			st.push(s.arr[i]);

		}
		return st;
	}

	public boolean Stack(Stack s) {
		if (this.arr.length == s.arr.length) {
			if (this.top == s.top) {
				for (int i = 0; i <= this.top; i++) {
					for (int j = 0; j <= s.top; j++) {
						if (this.arr[i].getAge() == s.arr[j].getAge())
						{
							if (this.arr[i].getGender()== s.arr[j].getGender())
							{
								if(this.arr[i].getName().equals(s.arr[j].getName()))
									return true;
								
							}
							
						}
					}
				}
			}

		}
		return false;
	}

}
