

public class Hashing {
	Student[] str;


	public Hashing(int size) {

		str = new Student[size];
	}
//************************************************************************
	public int HashFunction(Student s) {
		long no =s.getPhoneNo();
		int index = 0;
		long res,res1;            //721727283
		long sum=0;
	/*while(no>0)
	 * res=no%100
	 * sum=sum+res;
	 * no=no/100;
	 * 
	 * }
	 * index=(int)sum%arr.length
	 * 
	 * 
	 * 
	 */
		while(no >0) {
			res=no%10;
		    no=no/10;
		    res1=no%10;
		    sum=sum+(res+res1);
		    no=no%10;
	}//End Of While
			
		index = (int)sum % str.length;
		return index;
	}
//**************************************************************************
	public void Insert(Student s) {
		int index = HashFunction(s);
		System.out.print("For Student " + s.getName() + " The Key Is " + index);
		if (str[index] == null) {
			str[index] = s;

		}

		else // To check Collision
		{
            int count=0;
			while (count != str.length ) {
				index = (++index % str.length);
				if (str[index] == null)
				{
					str[index] = s;
					break;
				} 
				count++;
				}
			if(count == str.length) {
				System.out.println("The Hash Table Is Full");
			}
			  

		}
		System.out.println(" And It is placed at index: " + index);

	}
	//*******************************************************************

	public void Delete(Student s) {
		
		int index = QuadSearch(s);
		if(index==-1)
		{
			System.out.println("The Invalid Input");
		}
		else
		str[index] = null;

	}
	//******************************************************************

	public int LinSearch(Student s) {
		int index = HashFunction(s);
		String name2 = s.getName();
		if (str[index] != null && str[index].getName().equals(name2)) {
			return index;
		} else // For Collision
		{
			int i = 1;
			while (true) {
				index += 1;
				if (index > str.length - 1) {
					index = 0;
				} else if (str[index] != null && str[index].getName().equals(name2)) {
					return index;

				}
				

			}//End Of While
		}
	}
 //**************************************************************
	public int QuadSearch(Student s) {
		int index = HashFunction(s);
		String name=s.getName();
			if (str[index] != null && str[index].getName().equals(name)) {
			return index;

		} else {//For Collision
			int i = 1;
			int flag=0;
			while (true) {
				index += (i * i);
				if (index > str.length - 1) {
					index = 0;
				} else if (str[index] != null && str[index].getName().equals(name)) {
					flag++;
					return index;
				}
				else if(flag==0)
				{
					return -1;
				}

			}//End Of While
		}
	}
	//************************************************************************
	public int NewMethodSearch(Student s) {
		int index = HashFunction(s);
		String name = s.getName();
		if (str[index] != null && str[index].getName().equals(name)) {
			return index;

		} else {//For Collision
			int i = 1;
			while (true) {
				index +=i++;
				if (index > str.length - 1) {
					index = 0;
				} else if (str[index] != null && str[index].equals(name)) {
					return index;
				}

			}//End Of While
		}
	}
	//*********************************************************************************
	
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
