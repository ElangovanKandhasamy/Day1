package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		long factNumber = 100000L;
		long fact = 1L;
		for (i = 1; i <= factNumber; i++) {
			fact = fact * i;
			
		}
		System.out.println("The Factorial is " + fact);
	}
}