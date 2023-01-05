package operators;

public class Tiger extends Mammal{
    public static void main(String... args){
        Tiger tiger = new Tiger();
        String test = new String();
        Integer i = 10;
        String str2=null;
      //  System.out.println(str2.valueOf(i));
        //System.out.println(tiger);
        char[] charseq= {'a','b','c','x'};
        String newArr= new String(charseq);
        //System.out.println(newArr.length());
       //System.out.println( test.concat ("test1"+"Friday"+"17"));
        //System.out.println(test);
        tiger.charExtractionDemo ();
       /* tiger.makeNoise ();
        tiger.eat ();
        tiger.makeNoise ( "growls" );*/
        tiger.stringBufferDemo ();
       }
       @Override
       public String toString(){
          return "My own implementation";
       }
    @Override
    public void makeNoise(){
        System.out.println("Growl");
    }
    public void makeNoise(String sound){
        System.out.println("Tiger "+sound);
    }
    public void charExtractionDemo(){
        String demoStr = "This is a demo of the getChars method";
        //System.out.println(demoStr.startsWith("demo"));
        int start = 10;
        int end = 14;
        char disp[] = new char[end-start];
        demoStr.getChars(start,end,disp,0);
        //System.out.println(disp);
    }
     public void stringBufferDemo(){
        StringBuffer sb = new StringBuffer("Hello to StringBuffer");
        System.out.println(sb);
        System.out.println("Length"+sb.length());
         System.out.println("capacity"+sb.capacity());
         sb.ensureCapacity(10);
     }
}
