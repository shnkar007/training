package stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer> ();
        intList.add(80);
        intList.add(20);
        intList.add(15);
        intList.add(55);
        intList.add(1);
        System.out.println("Original List==="+intList);
        Stream<Integer> firstStream=intList.stream ();
        Optional<Integer> minimum=firstStream.min (Integer::compare);
        System.out.println("Minimum is "+minimum);
        Stream<Integer> secondStream = intList.stream ();
        Optional<Integer> maximum=secondStream.max(Integer::compare);
        System.out.println("Maximum is"+maximum);
        //sorting
        Stream<Integer> sortedStream=intList.stream().sorted ();
        sortedStream.forEach((n)->System.out.println(n+"-"));
        //Filtering
        Stream<Integer> oddNumbers= intList.stream().filter((n)->(n%2)==1);
        oddNumbers.forEach((n)->System.out.println(n+"~~~"));
        oddNumbers=intList.stream().filter((n)->(n%2)==1).filter((n)->n>3);
        oddNumbers.forEach((n->System.out.println("Double Filter"+n)));
    }
}
