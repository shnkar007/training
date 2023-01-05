package operators;

import java.util.*;

public class Standard implements Comparable<Student>{
    Student[] stuArr = new Student[3];

    public static void main(String... args){
         Standard std = new Standard();
         //std.addStudent ();
         //std.getStudentsByReg ();
        std.comparatorExample ();
    }
    public void addStudent(){
        stuArr[0] = new Student (1, "name", "CS", "1");
        stuArr[1] = new Student (3, "bingo", "CS", "1");
        stuArr[2] = new Student (2, "name", "CS", "1");
        List<Student> stuList = new ArrayList <Student>();
        List<String> ll = new LinkedList<String> ();
        ll.add("Hello");
        System.out.println("Linked List Size "+ll.size());
        stuList.add(stuArr[0]);
        stuList.addAll(Arrays.asList(stuArr));
        System.out.println("size of the list is "+stuList.size());
        System.out.println(stuList.get(2).getRegNo ());

    }
    public void getStudentsByReg(){

        Arrays.sort(stuArr);
        for(Student student : stuArr){
            System.out.println(student.getRegNo ());
        }
    }
    public void comparatorExample(){
        ArrayList<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student(1,"Sankar","CS","1"));
        stuList.add(new Student(2,"Kumar","MaterialSciences","2"));
        Collections.sort(stuList,new RegNoComparator ());
        for(Student student : stuList){
            System.out.println(student.getRegNo ());
        }
    }

    public void getMaxMarks(){
        
    }

    @Override
    public int compareTo(Student student) {
        int regNoOrder = ((Student) student).getRegNo ( );
        System.out.println("regNoOrder "+regNoOrder);
        return  regNoOrder-student.getRegNo () ;
    }
}
