
public class Exercise10_3 {

	public static void main(String[] args) {
		MyInteger n = new MyInteger(6);
		int value = n.getValue();
		System.out.println("My Integer Value is " + value);
		System.out.println("is six  even: " + MyInteger.isEven(6));
		System.out.println("is six  odd: " + MyInteger.isOdd(6));
		System.out.println("is six  prime: " + MyInteger.isPrime(6));
		System.out.println("is eleven  prime: " + MyInteger.isPrime(11));
		System.out.println("is six even: " + n.isEven());
		System.out.println("is six odd: " + n.isOdd());
		System.out.println("is six prime: " + n.isPrime());
		System.out.println("is six even: " + MyInteger.isEven(n));
		System.out.println("is six odd: " + MyInteger.isOdd(n));
		System.out.println("is six prime: " + MyInteger.isPrime(n));
		System.out.println("is eleven equal to six: " + n.equals(11));
		System.out.println("is object equal to self: " + n.equals(n));
		char[] a = new char[] {'1', '2', '3', '4'};
		System.out.println("array 1, 2, 3, 4, as int: " + MyInteger.parseInt(a));
		System.out.println("string 1234 as int: " + MyInteger.parseInt("1234"));
	}
}
