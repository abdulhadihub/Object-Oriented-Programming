
public class MoveablePoint implements Moveable {

	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		setX(x);
		setY(y);
		setxSpeed(xSpeed);
		setySpeed(ySpeed);
	}
	
	public String toString() {
		return ("("+ getX()+", "+ getY()+") speed = ("+ getxSpeed()+", "+ getySpeed()+")");
	}
	
	@Override
	public void moveUp() {
		setY((getY() - getySpeed()));
	}
	
	@Override
	public void moveDown() {
		setY((getY() + getySpeed()));
	}
	
	@Override
	public void moveLeft() {
		setX(getX() - getxSpeed());
	}
	
	@Override
	public void moveRight() {
		setX(getX()+ getxSpeed());
	}
	
}
