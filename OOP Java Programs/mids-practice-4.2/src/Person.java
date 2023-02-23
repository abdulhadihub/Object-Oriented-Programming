
public class Person {

	private String name;
	private String address;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Person(String name, String address) {
		setName(name);
		setAddress(address);
	}
	
	public Person() {
		this(null, null);
	}
	
	public String toString() {
		return ("Person[ name = " +  getName() + ", address = " + getAddress());
	}
}