public class Rectangle{
	double length;
	double width;
	public Rectangle(){
		length=0;
		width=0;
	}
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	public void setLength(double setLength){
		length = setLength;
	}

	public double getLength(){
		return length;
	}

	public void setWidth(double setWidth){
		width = setWidth;
	}

	public double getWidth(){
		return width;
	}

	public double getArea(){
		double area = length * width;
		return area;
	}

	public double getPerimeter(){
		double perimeter = (length + width)*2;
		return perimeter;
	}
}
