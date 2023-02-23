
public class TestStatsComputeable {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10, 10);
		Country country1 = new Country("Spain", 100);

		try {
			printStatsComputeable(rectangle1);
			System.out.print("\n");
			printStatsComputeable(country1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void printStatsComputeable(StatsComputeable obj) {
		obj.computeStats();
		System.out.println(obj.toString());
		obj.reset();
	}
}

