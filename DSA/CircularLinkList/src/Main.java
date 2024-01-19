
public class Main {
	
	public static void main(String []args) {
		
		CircularLL L1=new CircularLL();
		L1.InsertFirst(23);
	    L1.InsertFirst(43);
	    L1.InsertByPos(22,1);
	    L1.Append(29);
		//L1.DeleteFirst();
		L1.InsertByPos(22, 5);
	//	L1.DeleteByPos(2);
		L1.DeleteLast();
		System.out.println(L1);
		
	}

}
