
public class Main {
	public static void main(String[] args) {
	
		//Person object
		Person mercy = new Person("Mercy", 21, "6786433399","4915 lake park bend acworth GA 30101");
		
		//Values of instance variables
		System.out.println("Name: " + mercy.getName() );
		System.out.println("Age: " + mercy.getAge());
		System.out.println("phoneNumber: " + mercy.getPhoneNumber());
		System.out.println("address: "+ mercy.getAddress());
		
		// age increments by 1		
		mercy.growsOlder(); 
		
		System.out.println("new age: " + mercy.getAge());
	}

}
