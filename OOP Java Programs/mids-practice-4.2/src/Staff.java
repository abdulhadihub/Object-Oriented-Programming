
public class Staff extends Person {
	private String school;
	private double pay;
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		setSchool(school);
		setPay(pay);
	}
	
	public Staff() {
		this(null, null, null, 0);
	}
	
	@Override
	public String toString() {
		return ("Staff [Person [ name = " +  getName() + ", address = " + getAddress() + " ] school = " + getSchool() + ", pay = " + getPay() + "]");
	}
}
