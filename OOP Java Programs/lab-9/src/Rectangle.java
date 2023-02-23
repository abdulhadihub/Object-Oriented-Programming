
public class Rectangle extends Shape {
	private double width = 1;
	private double length = 1;
	private double rectArea;
	private double rectPerimeter;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	public double getRectArea() {
		return rectArea;
	}
	public void setRectArea(double rectArea) {
		if(rectArea == 0) {
			throw new ArithmeticException("Invalid Rectangle Area Value");
		}
		else
			this.rectArea = rectArea;
	}
	public double getRectPerimeter() {
		return rectPerimeter;
	}
	public void setRectPerimeter(double rectPerimeter) {
		if(rectPerimeter == 0) {
			throw new ArithmeticException("Invalid Rectangle Perimeter Value");
		}
		this.rectPerimeter = rectPerimeter;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
	super(color, filled);
	setWidth(width);
	setLength(length);
	}
	
	public Rectangle(double width, double length) {
		this(width, length, null, false);
	}
	
	public Rectangle() {
		this(0, 0, null, false);
	}
	
	public double getArea() {
		return (getLength()* getWidth());
	}
	
	public double getPerimeter() {
		return (2*(getLength()+ getWidth()));
	}
	
	@Override
	public String toString() {
		return ("Width: " + getWidth() + "\nLength: " +  getLength() + "\nArea: " + getRectArea() + "\nPerimeter: " +  getRectPerimeter());
	}
	
	@Override
	public void computeStats() {
		setRectArea(getArea());
		setRectPerimeter(getPerimeter());
	}
	
	@Override
	public void reset() {
		setRectArea(0);
		setRectPerimeter(0);
	}
}

