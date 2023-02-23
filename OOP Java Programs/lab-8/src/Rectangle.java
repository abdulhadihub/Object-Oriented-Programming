
public class Rectangle extends GeometricObject {

	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		setWidth(width);
		setHeight(height);
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public Rectangle(double width, double height) {
		this(width, height, null, false);
	}
	
	public Rectangle() {
		this(0, 0, null, false);
	}
	
	@Override
	public double getArea() {
		return (this.getWidth()*this.getHeight());
	}
	
	@Override
	public double getPerimeter() {
		return (2*(this.getWidth() + this.getHeight()));
	}
}
