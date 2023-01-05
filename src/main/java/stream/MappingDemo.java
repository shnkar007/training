package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingDemo {
    public static void main(String[] args) {
        List<Double> intList = new ArrayList<Double> ();
        intList.add(23.00);
        intList.add(87.50);
        intList.add(67.34);
        intList.add(5.0);
        intList.add(24.7);
        Stream<Double> sqrtDemo = intList.stream().map ((a)->Math.sqrt (a));
        double sqrtProduct = sqrtDemo.reduce (1.0,(a,b)->a*b);
        System.out.println("product of square root  "+sqrtProduct);
    }
}
