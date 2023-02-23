
public class Test {

	public static void main(String[] args) {
		Person[] institute = new Person[4];
		
		Student student1 = new Student("ali", "tajpura", "CS", 2, 90000);
		Student student2 = new Student("Farhan", "tajpura", "CS", 2, 90000);
		Staff staff1 = new Staff("Matee", "Kamsats", "COMSATS", 5000);
		Staff staff2 = new Staff("Faraz", "Lahore", "COMSATS", 500000);
		
		institute[0] = staff1;
		institute[1] = staff2;
		institute[2] = student1;
		institute[3] = student2;
		
		for(Person member : institute) {
			System.out.println(member.toString());
		}
	}

}
