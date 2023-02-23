public class Circle extends GeometricObject {
protected double radius = 1;
public double getRadius() {
return radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public Circle(double radius) {
setRadius(radius);
}
public Circle() {
this(1);
}
@Override
public double getPerimeter() {
return (Math.PI*2*getRadius());
}
@Override
public double getArea() {
return (Math.PI*Math.pow(getRadius(), 2));
}
}