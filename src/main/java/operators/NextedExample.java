package operators;

public class NextedExample {
    Nested nested = new Nested();
    public static void main(String... args){
        NextedExample nex = new NextedExample();
        Inner inner = new Inner();
        inner.innerCheck ();
      //  NextedExample.Nested nest= new Nested ();
      //  nest.nestedClassMethod ();
        nex.netedCheck();

    }
      public void netedCheck(){
          nested.nestedClassMethod();
      }
    static class Nested{
        public void nestedClassMethod(){
             System.out.println("Nested");
        }
    }
}
   class Inner{
         void innerCheck(){
             System.out.println("Innr class");
         }
  }