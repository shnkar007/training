package collectioexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    List<String> sampleList = new ArrayList<String> ();
    List<Integer> integerList = new ArrayList<Integer>();
    public static void main(String[] args) {
        ArrayListExample example = new ArrayListExample();
        //example.addition ();
        example.intListSample ();
    }
     public void addition(){
        sampleList.add("One");
        sampleList.add("Second");
         sampleList.add("Third");
         sampleList.add("Second");
         sampleList.add("Fourth");
         sampleList.add("Fifth");
         sampleList.add("Sixth");
         System.out.println("Size of "+sampleList.size());
         System.out.println("Sixth Element "+sampleList.get(5));
          sampleList.remove(3);
         System.out.println("Size after removal "+sampleList.size());
         //System.out.println("Duplicate List "+sampleList.copyOf(sampleList))
         for(String s: sampleList){
             System.out.println(s);
         }
     }
        public void intListSample(){
           integerList.add(1);
            integerList.add(8);
            integerList.add(2);
            integerList.add(5);
            integerList.add(4);
            integerList.add(3);
            integerList.add(6);
            integerList.add(9);
            integerList.add(7);
            integerList.add(10);
            Collections.sort(integerList);
            for(int element : integerList){
                System.out.println(integerList);
            }
        }
}
