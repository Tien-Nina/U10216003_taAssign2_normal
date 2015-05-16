public class Square{
	double width;
	public Square(){
		width=0;
	}
	public Square(double width){
		this.width = width;
	}

	public void setWidth(double setWidth){
		width = setWidth;
	}

	public double getWidth(){
		return width;
	}

	public double getArea(){
		double area = width * width;
		return area;
	}

	public double getPerimeter(){
		double perimeter = width*4;
		return perimeter;
	}
}
