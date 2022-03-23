package addressBookSystem_CSV_JSON;

/**
 * 
 * @author Rachoti Create a class CSVPerson
 *
 */

public class CSVPerson {
	/**
	 * Create a Annotation for all the Person Details
	 */
	@CsvBindByName(column = "fName")
	private String firstName;

	@CsvBindByName(column = "lName")
	private String lastName;

	@CsvBindByName(column = "address")
	private String PersonAddress;

	@CsvBindByName(column = "city")
	private String city;

	@CsvBindByName(column = "state")
	private String state;

	@CsvBindByName(column = "zip")
	private String zip;

	@CsvBindByName(column = "phoneNo")
	private String phone;

	@CsvBindByName(column = "email")
	private String email;

	public String getFirstName() {
		return firstName;
	}

	/**
	 * Create the getter and setter method for the Person Details
	 * 
	 * @param firstName lastName PersonAddress City state zip phone Email
	 * 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonAddress() {
		return PersonAddress;
	}

	public void setPersonAddress(String personAddress) {
		PersonAddress = personAddress;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}