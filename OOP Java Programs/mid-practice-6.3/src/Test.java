
public class Test {

	public static void main(String[] args) {
		MoveablePoint point1 = new MoveablePoint(2, 4, 6, 6);
		
		System.out.println(point1.toString());
		
		point1.moveLeft();
		System.out.println(point1.toString());
		
		point1.moveRight();
		System.out.println(point1.toString());
		
		point1.moveUp();
		System.out.println(point1.toString());
		
		point1.moveDown();
		System.out.println(point1.toString());

	}

}
