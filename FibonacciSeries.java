package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {


	int fibNo = 20;
	int number1 = 0;
    int number2= 1;
    int number3 ;
    System.out.println(+number1);
    System.out.println(+number2);
    for(int i = 0;i<=fibNo;i++)
	{
    	number3 = number1 +number2 ;
    	System.out.println("fib no"+number3);
    	number1 = number2;
    	number2 = number3;
	}
    
}
}