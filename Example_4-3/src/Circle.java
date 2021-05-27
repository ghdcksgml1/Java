
public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1;name="";
	}
	public Circle(int radius,String name) {
		this.radius = radius;
		this.name = name;
	}
	public double getArea() {
		return this.radius*this.radius*3.14;
	}
}
