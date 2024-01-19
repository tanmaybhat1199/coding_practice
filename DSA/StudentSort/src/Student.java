
	public class Student {
		
		private String name;
		private int age;
		private char gender;
		private int marks;

		public Student() {
			this.name="";
			this.age=0;
			this.gender = 'M';
			this.marks=0;
		}
		
		public Student(String n) {
			this.name=n;
			this.age=0;
			this.gender = 'M';
			this.marks=0;
		}
		
		public Student(String n,int a, char g,int m) {
			this.name=n.toUpperCase();
			this.age=a;
			this.gender = g ;
			this.marks=m;
			
		}
		public static void bubleByAge(Student []arr)
		{
			int i,j;
			Student temp;
			for(i=0;i<arr.length-1;i++) {
				for(j=0;j<arr.length-1;j++)
				{
					if(arr[j].age > arr[j+1].age)   //{2,10,21,9,35}
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
		}
		public static void bubleByName(Student []arr)
		{
			int i,j;
			Student temp;
			for(i=0;i<arr.length-1;i++) {
				for(j=0;j<arr.length-1;j++)
				{
					if(arr[j].name.compareTo( arr[j+1].name) > 0)   //{2,10,21,9,35}
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
		}
		public static void bubleByNameDescending(Student []arr)
		{
			int i,j;
			Student temp;
			for(i=0;i<arr.length-1;i++) {
				for(j=0;j<arr.length-1;j++)
				{
					if(arr[j].name.compareTo( arr[j+1].name) < 0)   //{2,10,21,9,35}
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			}
		}
		
        public static void display(Student []p)
        {
        	System.out.println("------------------------------");
        	for(int i=0;i<p.length;i++)
        	{
        		System.out.println(p[i].toString());
        	}
        }
	
		public String toString() {
		String str= new String("Name:"+name+":"+"Age"+age+":"+"Gender"+gender+":"+"Marks"+marks);
		return str;
		
		}


}
