package operators;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private int regNo;
    private String name;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    private String sem;

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public Student(int reg, String name, String course, String sem) {
        this.regNo = reg;
        this.name = name;
        this.course = course;
        this.sem = sem;
    }

    public static void main(String... args) {
        Student student = new Student (1, "name", "CS", "1");
        Student student1 = new Student(2,"name2","IT","1");

        int product, a = 10, b = 40;
        //product=student.product (a,b);
        // System.out.println(product);
        //student.enroll (student);
    }

    public Student enroll(Student student) {
        System.out.println (student.getRegNo ( ));
        return student;
    }
  /*  @Override
    public int compareTo(Student student) {
        int regNoOrder = ((Student) student).getRegNo ( );
        return this.regNo - regNoOrder;
    }
*/

    @Override
    public int compare(Student student, Student student1) {
        Student s1= student;
        Student s2 = student1;
        if(s1.getRegNo()<s2.getRegNo()){
            return 1;
        }else
        return 0;
    }
}