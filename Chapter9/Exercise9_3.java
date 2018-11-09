class Exercise9_3 {
	public static void main(String[] args) {
	java.util.Date date = new java.util.Date();

	System.out.println(date.toString());
	date.setTime(10000);
	System.out.println(date.toString());
	date.setTime(100000);
	System.out.println(date.toString());
	date.setTime(1000000);
	System.out.println(date.toString());
	date.setTime(10000000);
	System.out.println(date.toString());
	date.setTime(100000000);
	System.out.println(date.toString());
	date.setTime(1000000000);
	System.out.println(date.toString());
	long elapsedTime = 10000000000L;
	date.setTime(elapsedTime);
	System.out.println(date.toString());
	elapsedTime = 100000000000L;
	date.setTime(elapsedTime);
	System.out.println(date.toString());
	}
}