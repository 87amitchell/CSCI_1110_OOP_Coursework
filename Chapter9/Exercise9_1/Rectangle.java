public class Rectangle {
	double width;
	double height;
	
	public Rectangle(){
		width = 1.0;
		height = 1.0;
	}
	public Rectangle(double width1, double height1){
		width = width1;
		height = height1;
	}
	public double getArea(){
		return height * width;
	}
	public double getPerimeter(){
		return (height * 2) + (width * 2);
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
}