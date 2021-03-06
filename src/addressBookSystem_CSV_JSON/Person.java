package addressBookSystem_CSV_JSON;

/**
 * 
 * @author Rachoti create class called Person
 *
 */

public class Person {
	public String fName;
	public String lName;
	private String address;
	public String city;
	public String state;
	private String zip;
	private String phoneNo;
	private String email;

	/**
	 * Create a Constructor and passing the parameters
	 * 
	 * @param fName
	 * @param lName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phoneNo
	 * @param email
	 */

	public Person(String fName, String lName, String address, String city, String state, String zip, String phoneNo,
			String email) {
		this.fName = fName;
		this.lName = lName; // this is used point the Current object
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	/**
	 * Create the getter and setter method to set the values
	 * 
	 * @return
	 */

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @Override
	 */

	@Override
	public String toString() {
		return "Person Address [FirstName=" + fName + ", LastName=" + lName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]" + "\n";
	}
}