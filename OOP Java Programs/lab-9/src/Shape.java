
public abstract class Shape implements StatsComputeable{
	private String color = "red";
	private boolean filled = true;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Shape(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	
	public Shape() {
		this(null, false);
	}
	
	public String toString() {
		return (getColor() + isFilled());
	}
}
