
public class Main {

	public static void main(String[] args) {
		BST t1=new BST();
		t1.insert(10);
		t1.insert(56);
	/*	t1.insert(24);
		t1.insert(4);
		t1.insert(34);
		t1.insert(19);
		t1.insert(8);
		t1.insert(3);
	//	t1.insert(21);
		t1.insert(1);
	//	t1.insert(-54);
	//	t1.insert(-123);*/
		t1.Preorder();
		t1.Inorder();
		t1.Postorder();
		t1.PrintLargest();
		t1.PrintSmallest();
		t1.DeleteElement(10);
		t1.Inorder();
		t1.CalculateHeight();
		
	}

}
