//Bubble Sort
public class Main {

	public static void main(String[] args) {
		Student[]arr=new Student[4];
	    arr[0]=new Student("Ram",22,'m',70);
	    arr[1]=new Student("rani",21,'f',79);
	    arr[2]=new Student("sham",24,'m',81);
	    arr[3]=new Student("vani",19,'f',75);
		
	    
	    
	    Student.bubleByAge(arr); //Ascending
	    Student.display(arr);
	    Student.bubleByName(arr);
	    Student.display(arr);
	    Student.bubleByNameDescending(arr);
	    Student.display(arr);
		
	}

}
