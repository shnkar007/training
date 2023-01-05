package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingWithCustomObjectDemo {
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
        Stream<NamePhone> namePhoneStream= pDetails.stream().map(
                (a)->new NamePhone(a.name,a.phone));
        namePhoneStream.forEach((a)->{
            System.out.println(a.name+" "+a.phone);
        });
    }
}
class PersonDetails{
    String name;
    String phone;
    String email;
    PersonDetails(String n, String p, String mail){
        name=n;
        phone=p;
        email=mail;
    }
}
 class NamePhone{
    String name;
    String phone;
    NamePhone(String n, String p){
        name=n;
        phone=p;
    }
 }