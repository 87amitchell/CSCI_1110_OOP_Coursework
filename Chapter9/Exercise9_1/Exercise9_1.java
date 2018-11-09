class Exercise9_1 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		System.out.println(rectangle1.getWidth() + " " + rectangle1.getHeight() + " " + rectangle1.getArea() + " " +rectangle1.getPerimeter());
		System.out.println(rectangle2.getWidth() + " " + rectangle2.getHeight() + " " + rectangle2.getArea() + " " +rectangle2.getPerimeter());
	}
}