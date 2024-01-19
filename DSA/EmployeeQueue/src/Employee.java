
	public class Employee {
		int empid;
	    String empname;
		int Salary;
		
		public Employee()
		{
			empid=1;
			empname="Null";
			Salary=0;
		}
		public Employee(int x,String y,int z)
		{
			empid=x;  
			empname=y;
			Salary=z;
		}	
		public String toString()
		{
			String str="";
            str += empid +":"+empname+":"+Salary;
            		return str;
		}
}
