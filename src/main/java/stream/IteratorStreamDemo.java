package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorStreamDemo {
    public static void main(String[] args) {
        List<PersonDetails> pDetails = new ArrayList<PersonDetails> ();
        pDetails.add(new PersonDetails("Mohan","922-333-4444","mohan@excelancia.com"));
        pDetails.add(new PersonDetails("Sasi","823-449-0909","sasi@excelencia.com"));
        pDetails.add(new PersonDetails("Selciya","652-345-6700","selciya@excalencia.com"));
        pDetails.add(new PersonDetails("Sneha","450-345-8765","sneha@excelencia.com"));
        System.out.println("Original List ");
        pDetails.stream().forEach ((a)->{
            System.out.println(a.name+" "+a.phone+" "+a.email);
        });
        Stream<PersonDetails> personStream=pDetails.stream();
        Iterator<PersonDetails> perIterator=personStream.iterator ();
        while(perIterator.hasNext()){
            System.out.println(perIterator.next().name+ " "+perIterator.next().email);
        }
    }
}
