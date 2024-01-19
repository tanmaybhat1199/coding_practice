
public class RecExp1 {
	public static void main(String []args) {
		int a=0;
		fun (0);
	}
    public static void fun(int a) {
    	System.out.print(a+" ");
    	if(a<10) {
    	   a=	a+2;
    		fun(a);
    	}
    		System.out.print(a+" ");
    	}
    }

