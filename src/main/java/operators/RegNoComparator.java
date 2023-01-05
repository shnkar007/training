package operators;

import java.util.Comparator;

public class RegNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student1) {
        Student s1 = student;
        Student s2 = student1;
        return s1.getName ( ).compareTo (s2.getName ( ));
    }
}

