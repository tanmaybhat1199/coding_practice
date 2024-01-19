
public class ABC {

	public static void main(String[] args) {
		
		String s1="Prajakta     Sanchit    Chimankar";
		removeSpaces(s1);
		int num=8923;
		int rem=num%1000;
		System.out.println(rem+" "+num);
		

	}
	
	public static void removeSpaces(String str)
	{
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
			{
				continue;
			}
			else {
				str1=str1+str.charAt(i);
			}
			
		}
		System.out.println(str1);
	}



	
	
	
}
