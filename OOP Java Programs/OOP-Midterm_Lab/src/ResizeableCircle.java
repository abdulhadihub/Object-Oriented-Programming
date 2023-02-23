public class ResizeableCircle extends Circle {
public ResizeableCircle(double radius) {
super(radius);
}
public ResizeableCircle() {
super();
}
public void resize(int percent) {
double scale = percent/100;
super.setRadius(super.getRadius()*scale);
}
}