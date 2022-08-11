package PojoForSerialozationAndDeserialization;

public class EmployeeDetailsWithArray {
	
	//Step1 : Declaring the variables
	String name;
	String id;
	int phno[];
	String email[];
	String address;

	
	//Step2: Creating a parameterised Constructor
	public EmployeeDetailsWithArray(String name, String id, int[] phno, String[] email, String address) {
		this.name = name;
		this.id = id;
		this.phno = phno;
		this.email = email;
		this.address = address;
	}

	public EmployeeDetailsWithArray()
	{
		
	}

	
	//Step 3: Creating getters and setters method
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
