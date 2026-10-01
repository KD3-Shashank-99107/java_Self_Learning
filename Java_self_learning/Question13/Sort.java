package Question13;

import java.util.Comparator;

public class Sort implements Comparator<Student> {


    // city desc, marks desc, name asc
    @Override
    public int compare(Student s1, Student s2) {

        if (s1.getCity().compareTo(s2.getCity()) != 0)
            return s2.getCity().compareTo(s1.getCity());

        else if (Double.compare(s2.getMarks(), s1.getMarks()) != 0)
            return Double.compare(s2.getMarks(), s1.getMarks());

        else
            return s1.getName().compareTo(s2.getName());
    }
}