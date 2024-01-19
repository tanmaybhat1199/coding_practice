
public class Hashing {
	String [] str;

	public Hashing(int size) {

		str = new String[size];
		
	}

	public int HashFunction(String str) {
		int sum = 0;
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i);

		}
		index = sum % str.length();
		return index;
	}

	public void Insert(String Ipstr) {
		int index = HashFunction(Ipstr);
		System.out.print("For String " + Ipstr + " The Key Is " + index);
		if (str[index] == null) {
			str[index] = Ipstr;

		}

		else // To check Collision
		{

			while (true) {
				int flag = 0;
				index = (++index % str.length);
				if (str[index] == null) {
					flag = 1;
					str[index] = Ipstr;
					break;
				} else if (flag == 0) {
					System.out.println("Invalid Input String");
				}
			}

		}
		System.out.println(" And It is placed at index: " + index);

	}

	public void Delete(String Ipstr) {
		
		int index = QuadSearch(Ipstr);
		if(index==-1)
		{
			System.out.println("The Invalid String Input");
		}
		else
		str[index] = null;

	}

	public int LinSearch(String Ipstr) {
		int index = HashFunction(Ipstr);
		if (str[index] != null && str[index].equals(Ipstr)) {
			return index;
		} else // For Collision
		{
			int i = 1;
			while (true) {
				int flag=0;
				index += 1;
				if (index > str.length - 1) {
					index = 0;
				} else if (str[index] != null && str[index].equals(Ipstr)) {
					flag++;
					return index;

				}else if(flag==0) {
					return -1;
				}
				

			}
		}
	}
 
	public int QuadSearch(String Ipstr) {
		int index = HashFunction(Ipstr);
		if (str[index] != null && str[index].equals(Ipstr)) {
			return index;

		} else {//For Collision
			int i = 1;
			int flag=0;
			while (true) {
				index += (i * i);
				if (index > str.length - 1) {
					index = 0;
				} else if (str[index] != null && str[index].equals(Ipstr)) {
					flag++;
					return index;
				}
				else if(flag==0)
				{
					return -1;
				}

			}
		}
	}
	public int NewMethodSearch(String Ipstr) {
		int index = HashFunction(Ipstr);
		if (str[index] != null && str[index].equals(Ipstr)) {
			return index;

		} else {//For Collision
			int i = 1;
			while (true) {
				index +=i++;
				if (index > str.length - 1) {
					index = 0;
				} else if (str[index] != null && str[index].equals(Ipstr)) {
					return index;
				}

			}
		}
	}
	
	public String toString()
	{
		String s="{";
		for(int i=0;i<str.length;i++)
		{
			s+= str[i] + ",";
		}
		s+="}";
		return s;
	}
}
