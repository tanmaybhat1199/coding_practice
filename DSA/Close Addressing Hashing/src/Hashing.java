

public class Hashing {
	LinkedList [] LLarray;

	public Hashing(int size) {

		LLarray = new LinkedList[size];
	
		for(int i=0;i<LLarray.length;i++)
		{
			LLarray[i]=new LinkedList();
			
		}
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
		LLarray[index].append(Ipstr);

		
		System.out.println(" And It is placed at index: " + index);

	}

	public void Delete(String Ipstr) {
		
		int index = QuadSearch(Ipstr);
		int res=LLarray[index].DeleteByValue(Ipstr);
		if(res!=0);
		{
			System.out.println("The String Is Deleted");
		}
		
	}

	public int LinSearch(String Ipstr) {
		int index = HashFunction(Ipstr);
		if (LLarray[index] != null && LLarray[index].equals(Ipstr)) {
			return index;
		} else // For Collision
		{
			int i = 1;
			while (true) {
				int flag=0;
				index += 1;
				if (index > LLarray.length - 1) {
					index = 0;
				} else if (LLarray[index] != null && LLarray[index].equals(Ipstr)) {
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
		if (LLarray[index] != null && LLarray[index].equals(Ipstr)) {
			return index;

		} else {//For Collision
			int i = 1;
			int flag=0;
			while (true) {
				index += (i * i);
				if (index > LLarray.length - 1) {
					index = 0;
				} else if (LLarray[index] != null && LLarray[index].equals(Ipstr)) {
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
		if (LLarray[index] != null && LLarray[index].equals(Ipstr)) {
			return index;

		} else {//For Collision
			int i = 1;
			while (true) {
				index +=i++;
				if (index > LLarray.length - 1) {
					index = 0;
				} else if (LLarray[index] != null && LLarray[index].equals(Ipstr)) {
					return index;
				}

			}
		}
	}
	
	public String toString()
	{
		String s="{";
		for(int i=0;i<LLarray.length;i++)
		{
			s+= LLarray[i] + ",";
		}
		s+="}";
		return s;
	}
}
