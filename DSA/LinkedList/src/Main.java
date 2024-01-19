
public class Main {

	public static void main(String[] args) {
		
		LinkedList LL = new LinkedList();
		LL.insert(300);
		LL.append(200);
		LL.insert(100);
		LL.insert(150);
		LL.insertbypos(2343, 3);
		LL.append(190);
		LL.deletelast();
		LL.deletebypos(2);
		System.out.println(LL);
		//LL.reverseprint();
		LL.reverse();
		System.out.println(LL);
		
		
	}

}
