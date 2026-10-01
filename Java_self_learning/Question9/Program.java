package Question9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		
		int sum = IntStream.of(10,20,30,40).sum();

		System.out.println("Sum : "+ sum);
	}
}
