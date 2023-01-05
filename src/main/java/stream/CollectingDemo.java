package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingDemo {
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
        Stream<NamePhone> npStream=pDetails.stream().map ((a)->new NamePhone(a.name,a.phone));
        List<NamePhone> npList=npStream.collect(Collectors.toList());
        for(NamePhone nap: npList){
            System.out.println(nap.name+"  "+nap.phone);
        }
        //Set
        Stream<NamePhone> npSetStream=pDetails.stream().map ((a)->new NamePhone(a.name,a.phone));
        Set<NamePhone> npSet=npSetStream.collect(Collectors.toSet());
        System.out.println("Set ======>");
        for(NamePhone nap: npSet){
            System.out.println(nap.name+"  "+nap.phone);
        }
    }
}
