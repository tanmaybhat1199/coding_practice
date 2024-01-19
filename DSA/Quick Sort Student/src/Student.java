
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
	
		
        public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		
	
		public String toString() {
		String str= new String("Name:"+name+":"+"Age"+age+":"+"Gender"+gender+":"+"Marks"+marks);
		return str;
		
		}


}
