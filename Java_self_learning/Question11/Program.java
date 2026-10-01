package Question11;

import java.util.Scanner;

public class Program {
	public static <T extends Number & Comparable<T>>  T  minimumFromArray(T [] arr){
		T min =arr[0] ;
		for(int i = 0; i<arr.length; i++) {
			if(min.compareTo(arr[i])>0) {
				min=arr[i];
			}
		}
		
		return min;
	} 	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer [] arr=new Integer[10];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value  : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Minimum Value : "+minimumFromArray(arr));
	}
}
