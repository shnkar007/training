package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Double> intList = new ArrayList<Double>();
        intList.add(23.00);
        intList.add(87.50);
        intList.add(67.34);
        double product = intList.parallelStream ().reduce(1.0,(a,b)->a * Math.sqrt(b),(a,b)->a*b);

        System.out.println(product);
    }
}
