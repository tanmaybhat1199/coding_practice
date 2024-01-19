
public class Student {
		
		private String name;
		private int age;
		private char gender;
		private long PhoneNo;

		public Student() {
			this.name="";
			this.age=0;
			this.gender = 'M';
			this.PhoneNo=0;
		}
		public String toString()
		{
			String str="[Name: "+name+" Age: "+age+" Gender: "+gender+" PhoneNo: "+PhoneNo +"]";
			return str;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public long getPhoneNo() {
			return PhoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			PhoneNo = phoneNo;
		}

		public Student(String n) {
			this.name=n;
			this.age=0;
			this.gender = 'M';
			this.PhoneNo=0;
		}
		
		public Student(String n,int a, char g,long nm) {
			this.name=n.toUpperCase();
			this.age=a;
			this.gender = g ;
			this.PhoneNo=nm;

}}
