public class Circle{
	double radius;
	public Circle(){
		radius=0;
	}
	public Circle(double radius){
		this.radius = radius;
	}

	public void setRadius(double newRadius){
		radius = newRadius;
	}

	public double getRadius(){
		return radius;
	}

	public double getArea(){
		double area = radius*radius*Math.PI;
		return area;
	}

	public double getPerimeter(){
		double perimeter = radius * 2 * Math.PI;
		return perimeter;
	}
}
