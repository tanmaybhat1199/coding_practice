
public class Employee {
	private int empid;
	private String empname;
	private int basicSalary;
	
	public Employee()
	{
		empid=1;
		empname="Null";
		basicSalary=0;
	}
	public Employee(int x,String y,int z)
	{
		empid=x;
		empname=y;
		basicSalary=z;
	}	

	public String toString()
    {
    	String str = new String("employee(" +empid+ "," +empname+ "," +basicSalary+ ")");
    	return str;
    }
	
}
