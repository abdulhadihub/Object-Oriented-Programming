import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter value for Side A: ");
		double sideA = input.nextDouble();
		System.out.print("\nPlease Enter value for Side B: ");
		double sideB = input.nextDouble();
		System.out.print("\nPlease Enter value for Side C: ");
		double sideC = input.nextDouble();
		
		String whiteSpace = input.nextLine();
		
		System.out.print("\nPlease Enter color: ");
		String color = input.nextLine();
		System.out.print("\nPlease Enter whether the shape is filled or not (true or false answers only): ");
		boolean filled = input.nextBoolean();
		
		Triangle triangle1 = new Triangle(sideA, sideB, sideC, color, filled);
		
		System.out.println("The area of the Triangle is: " + String.format("%.2f", triangle1.getArea()));
		System.out.println("The perimeter of the Triangle is: " + triangle1.getPerimeter());
		System.out.println("The color of the Triangle is: " + triangle1.getColor());
		System.out.println("Is the Triangle filled: " + triangle1.isFilled());

	}

}
