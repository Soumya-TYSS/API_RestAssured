package PojoForSerialozationAndDeserialization;

public class EmployeeDetails {
	
	//Step1: Declare all the variables as global
	String eName;
	String eID;
	int phone;
	String email;
	String address;
	
	//Step2: Use Constructor to initialise
	
	public EmployeeDetails(String eName, String eID, int phone, String email, String address) {
		this.eName = eName;
		this.eID = eID;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
	public EmployeeDetails()
	{
		
	}


   //Step3: Create Getters and Setters	
	
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteID() {
		return eID;
	}

	public void seteID(String eID) {
		this.eID = eID;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	

}
