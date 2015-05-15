public class Person {

	//Instance variable	
	private String name;
	private int age;
	private String phoneNumber;
	private String address;

	//Constructor
	public Person(String _name, int _age, String _phoneNumber,String _address) {		

		//Instance variable
		name = _name;
		age =_age;
		phoneNumber =_phoneNumber;
		address =_address;
	}

	//Get name
	public String getName() {
		return name;
	}

	// Get age
	public int getAge() {
		return age;
	}

	//Get phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

	//Get address
	public String getAddress() {
		return address;
	}

	//Set name
	public void setName(String name) {
		this.name = name;
	}	

	//Set age
	public void setAge(int age) {
		this.age = age;
	}

	//Set phone number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//Set address
	public void setAddress(String address) {
		this.address = address;
	}

	//Increments age by 1
	public void growsOlder() {
		age = age + 1;
	}

}

