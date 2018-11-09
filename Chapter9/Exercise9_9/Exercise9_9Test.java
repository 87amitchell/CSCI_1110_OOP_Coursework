
public class Exercise9_9Test {

	public static void main(String[] args) {
		RegularPolygon object1 = new RegularPolygon(6, 4);
		RegularPolygon object2 = new RegularPolygon(10, 4.5, 6, 7.8);
		System.out.println("Polygon 1 with " + object1.getN() + " sides and " + object1.getSide() + " lenght of each side has a perimeter of " + object1.getPerimeter() + " and an area of " + object1.getArea());
		System.out.println();
		System.out.println("Polygon 2 with " + object2.getN() + " sides and " + object2.getSide() + " lenght of each side and starting x location of " + object2.getX() + " and a starting y location of "+ object2.getY() + " has a perimeter of " + object2.getPerimeter() + " and an area of " + object2.getArea());
	}

}
