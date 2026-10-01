package Question13;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Student[] students = new Student[8];

	
			    students[0]=new Student(1, "Sachin", "Pune", 85.5);
			    students[1] =new Student(2, "Rahul", "Mumbai", 90.0);
			    students[2] =new Student(3, "Amit", "Pune", 92.0);
			    students[3] =new Student(4, "Pratik", "Mumbai", 90.0);
			    students[4] = new Student(5, "Akshay", "Pune", 85.5);
			    students[5] =new Student(6, "Vishal", "Nashik", 88.0);
			    students[6] =new Student(7, "Rohit", "Mumbai", 95.0);
			    students[7] =new Student(8, "Kunal", "Pune", 92.0);
			
	
		
		
		for(Student st : students) {
			System.out.println(st);
		}System.out.println();
		
		Arrays.sort(students, new Sort());
		
		for(Student st : students) {
			System.out.println(st);
		}
		
		
	}
}
