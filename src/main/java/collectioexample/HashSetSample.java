package collectioexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetSample {
    Set<String> sampleList = new HashSet<String> ();

    public static void main(String[] args) {
        HashSetSample example = new HashSetSample();
        example.addition ();

    }
    public void addition(){
        sampleList.add("One");
        sampleList.add("Second");
        sampleList.add("Third");
        sampleList.add("Second");
        sampleList.add("Fourth");
        sampleList.add("Fifth");
        sampleList.add("Sixth");
        System.out.println("Size of "+sampleList);

  //      sampleList.remove("Sixth");
        sampleList.clear();
        System.out.println("after removal "+ sampleList);
        //System.out.println("Duplicate List "+sampleList.copyOf(sampleList))
        /*for(String s: sampleList){
            System.out.println(s);
        }*/
    }
}
