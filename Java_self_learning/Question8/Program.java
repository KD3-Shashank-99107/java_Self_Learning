package Question8;

import java.util.stream.IntStream;

public class Program {
	public static void main(String []args) {
		int n = 5;
		
		int factorial = IntStream.rangeClosed(1, n).reduce(1, (x,y)-> x*y);
		System.out.println("Factorial : "+ factorial);
	}
}
