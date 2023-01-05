package implementation;

import operators.AbsDemo;

public class AbsClient extends AbsDemo {
    @Override
    public void sayHello(){
        System.out.println("Implementation in the child");
    }
    public static void main(String... args){
        AbsClient client = new AbsClient();
        client.absImplementation ();
        client.sayHello ();
        Integer id = 10;
        Long l = 40L;
    }
}
