package exception;

import operators.Student;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {
    public static void main(String[] args) throws CustomException {
        try {
            int[] intArr = new int[5];
            List<Student> list= new ArrayList<Student> ();
            list.add(new Student(1,"Sankar","CS","4"));
            list.add(new Student(2,"Bala","Mech","5"));
            for(Student s : list){
                System.out.println("login");
                if(s.getName().equals("Sriram")){
                    throw new CustomException ();
                }
            }

            System.out.println("Before exception");
            intArr[10]=20;
            System.out.println("After exception");

        }catch(Exception e){
            throw new CustomException ();
            //e.printStackTrace();
        }
        finally{
            System.out.println("something");
        }
    }
}
