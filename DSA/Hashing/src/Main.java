
public class Main {

	public static void main(String[] args) {
		Hashing hash =new Hashing(15);
		hash.Insert("Tanmay");
		hash.Insert("ram");
		hash.Insert("sham");
		hash.Insert("vani");
		System.out.println(hash);
		hash.Delete("Amol");
		System.out.println(hash);
		

	}

}
