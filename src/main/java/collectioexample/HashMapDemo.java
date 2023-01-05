package collectioexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> myMap = new HashMap<String,Double>();
        myMap.put("Sankar",100000.00);
        myMap.put("RR",80000.00);
        myMap.put("MU",25000.00);
        System.out.println(myMap.size ()+"====> is the size of the Hashmap");
        //Get a single element by key
        System.out.println(myMap.replace ("Sankar",500000.00));
        System.out.println(myMap.get("Sankar"));
        System.out.println("Removing an object"+myMap.remove("MU"));
        System.out.println(myMap.size ()+"====> is the size of the Hashmap after removal");
        for(Map.Entry entry : myMap.entrySet()){
             System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
