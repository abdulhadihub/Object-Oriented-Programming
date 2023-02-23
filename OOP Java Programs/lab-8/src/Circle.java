
public class Circle extends GeometricObject {
	private double radius;

	public Circle(double radius, String color, boolean filled) {
		setRadius(radius);
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public Circle() {
		this(0, null, false);
	}
	
	public Circle(double radius) {
		this(radius, null, false);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getDiameter() {
		return (2*this.getRadius());
	}
	
	@Override
	public double getArea() {
		return (Math.PI*Math.pow(this.getRadius(), 2));
	}
	
	@Override
	public double getPerimeter() {
		return (Math.PI*2*this.getRadius());
	}
}
