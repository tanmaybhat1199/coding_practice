
public class Student {

		
		 String name;
		 int age;
		 char gender;

		public Student() {
			this.name="";
			this.age=0;
			this.gender = 'M';
		}
		
		public Student(String n) {
			this.name=n;
			this.age=0;
			this.gender = 'M';
		}
		
		public Student(String n,int a, char g) {
			this.name=n.toUpperCase();
			this.age=a;
			this.gender = g ;
		}

	
		public String toString() {
			String str=" "+name+":"+age+":"+gender;
			return str;
			
		}
		
		

}
