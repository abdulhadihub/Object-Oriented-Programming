
public class Triangle extends GeometricObject {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
		this.setSideA(sideA);
		this.setSideB(sideB);
		this.setSideC(sideC);
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public Triangle(double sideA, double sideB, double sideC) {
		this(sideA, sideB, sideC, null, false);
	}
	
	public Triangle() {
		this(0,0, 0,null,false);
	}
	
	@Override
	public double getArea() {
		double p = (this.getPerimeter()/2);
		double areaSquared = (p*(p-this.getSideA())*(p-this.getSideB())*(p-this.getSideC()));
		return (Math.sqrt(areaSquared));
	}
	
	@Override
	public double getPerimeter() {
		return (this.getSideA()+this.getSideB()+this.getSideC());
	}
}
