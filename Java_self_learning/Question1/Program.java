package Question1;

class Student extends Object implements Cloneable{
	private String name;
	private int roll;
	private Date admissionDate;
	
	Student(String name, int roll, Date admissionDate){
		this.name = name;
		this.roll = roll;
		this.admissionDate = admissionDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	//Shallow Copy
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		Student std = (Student)super.clone();
//		return std;
//	}
	
	// Deep Copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student std = (Student)super.clone();
		std.admissionDate = (Date) super.clone();
		return std;
	}
	
}
public class Program {
public static void main(String[] args) throws CloneNotSupportedException{
	Date d1 = new Date(01,01,2000);
	Student d = new Student("Sachin", 98807,d1);
	Student s = (Student) d.clone();
}
}
