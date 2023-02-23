import java.util.ArrayList;
public class TestCircle {
public static void main(String[] args) {
System.out.println("Task A");
ArrayList<GeometricObject> arrList = new ArrayList<GeometricObject>();
GeometricObject circle1 = new Circle(2);
GeometricObject circle2 = new Circle(4);
GeometricObject circle3 = new Circle(6);
GeometricObject resizeCircle1 = new ResizeableCircle (2);
GeometricObject resizeCircle2 = new ResizeableCircle (4);
arrList.add(0, circle1);
arrList.add(1, circle2);
arrList.add(2, circle3);
arrList.add(3, resizeCircle1);
arrList.add(4, resizeCircle2);
System.out.println("Task B");
for(int i = 0; i < arrList.size() ; i++) {
System.out.println("The area of Circle " + (i+1) + " is: " + String.format("%.2f", arrList.get(i).getArea()));
System.out.println("The Perimeter of Circle " + (i+1) + " is: " + String.format("%.2f", arrList.get(i).getPerimeter()));
System.out.print("\n");
}
System.out.println("Task C");
Circle[] circleArray = new Circle[5];
ResizeableCircle[] resizeCircleArray = new ResizeableCircle[5];

int i = 0;
int j  = 0;
for(GeometricObject arrItem : arrList) {
	if(arrItem instanceof Circle) {
		GeometricObject p = new Circle();
		Circle c = (Circle)arrItem;
		circleArray[i] = c;
		i++;
	}
	
	if(arrItem instanceof ResizeableCircle) {
		ResizeableCircle d = (ResizeableCircle)arrItem;
		resizeCircleArray[j] = d;
		j++;
	}
}

System.out.println("Task D");
for(int k = 0; k < 2; k++) {
	if(circleArray[k].getRadius()== resizeCircleArray[k].getRadius()) {
		System.out.println("The area of Circle " + (k+1) + " is: " + String.format("%.2f", circleArray[k].getArea()));
	}
}
}
}