
public class MyInteger {
	int value;
	
	public MyInteger(int n) {
		this.value = n;
	}
	public int getValue () {
		return value;
	}
	public boolean isEven(){
		return isEven(value);
	}
	public boolean isOdd(){
		return isOdd(value);
	}
	public boolean isPrime(){
		return isPrime(value);
	}
	public static boolean isEven(int n){
		if (n % 2 == 0) {
		return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(int n){
		return n % 2 != 0;
	}
	public static boolean isPrime(int n){
		if ((n == 1) || (n == 2)) {
		return true;
		}
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger o){
		return isEven(o.getValue());
	}
	public static boolean isOdd(MyInteger o){
		return isOdd(o.getValue());
	}
	public static boolean isPrime(MyInteger o){
		return isPrime(o.getValue());
	}
	public boolean equals(int n) {
		return n == value;
	}
	public boolean equals(MyInteger o) {
		return value == o.getValue();
	}
	public static int parseInt(char[] n) {
		//converts an array of numeric characters into a String into an int value
		String m = new String(n);
		return Integer.parseInt(m);
	}
	public static int parseInt(String m) {
		//converts a string into an int value
		return Integer.parseInt(m);
	}
}