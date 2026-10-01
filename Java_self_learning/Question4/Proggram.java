package Question4;

enum Days{
	MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
    	return this == SATURDAY || this == SUNDAY;
    }
    
    public boolean Weekday() {
    	return !isWeekend();
    }
}
public class Proggram {
	public static void main(String[] args) {
		Days day = Days.FRIDAY;
		
		
		System.out.println("Day : "+ day);
		System.out.println("WeakEnd : "+ day.isWeekend());
		System.out.println("Week Day : "+ day.Weekday());
		System.out.println();
		
		
		Days day1 = Days.TUESDAY;
		
		System.out.println("Day : "+ day1);
		System.out.println("WeakEnd : "+ day1.isWeekend());
		System.out.println("Week Day : "+ day1.Weekday());
		
	}

}
