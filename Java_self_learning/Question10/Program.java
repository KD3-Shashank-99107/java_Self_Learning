package Question10;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program {
	public static void main(String [] args) {
		 IntStream stream = IntStream.rangeClosed(1, 10);

	        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();

	        System.out.println("Sum = " + stats.getSum());
	        System.out.println("Count = " + stats.getCount());
	        System.out.println("Min = " + stats.getMin());
	        System.out.println("Max = " + stats.getMax());
	        System.out.println("Average = " + stats.getAverage());
		
	}
}
