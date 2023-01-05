package stream;

import java.util.ArrayList;
import java.util.Optional;

public class ReductionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer> ();
        intList.add(1);
        intList.add(20);
        intList.add(15);
        intList.add(95);
        Optional<Integer> productObj = intList.stream().reduce((a,b)->a*b);
        if(productObj.isPresent ()){
            System.out.println(productObj.get());
        }
        //int version
        int result = intList.stream().reduce(1,(a,b)->a*b);
        System.out.println("reduced stream "+result);
    }
}
