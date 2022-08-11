package PojoForSerialozationAndDeserialization;

public class Employee3 {
	
	String name;
	String id;
	int[] phno;
	String[] email;
	String address;
	SoupseDetails s;
	
	
	public Employee3(String name, String id, int[] phno, String[] email, String address,  SoupseDetails s) {
		this.name = name;
		this.id = id;
		this.phno = phno;
		this.email = email;
		this.address = address;
		this.s = s;
	}

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

	public SoupseDetails getS() {
		return s;
	}

	public void setS(SoupseDetails s) {
		this.s = s;
	}

	
	
	
	
	
}
