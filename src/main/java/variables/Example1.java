package variables;

public class Example1 {
   private static int count=10;
    public static void main(String... args){
        int var1;
        int var2;
        var1=1024;
        var2=var1/2;
        System.out.println(count);
        System.out.println(var2);
        Example1 ex1 = new Example1();
       /* ex1.intDouble ();
        ex1.switchDemo ();
        ex1.galToLit ();
        ex1.ichesCalc ();*/
        ex1.charDemo ();

    }
    public void intDouble(){
        int var1;
        double var2;
        var1=10;
        var2=10.0;
        System.out.println("\n");
        var1=var1%4;
        System.out.println("var1 is"+var1);
        var2=var2/4;
        System.out.println("var2 is "+var2);
    }
      public void switchDemo(){
        for(int i=0;i<10;i++){
            switch(i){
                case 0:
                    System.out.println("zero");
                case 1:
                    System.out.println("One");
                default:
                    System.out.println("2 or more");
            }
        }
      }
    public void galToLit(){
        double gallons;
        double liter;
        gallons = 10;
        liter=gallons*3.7584;
        System.out.println(gallons+"gallons "+liter+"litres");
    }
    public void ichesCalc(){
        long ci;
        long cm;
        cm = 5280*12;
        ci = cm*cm*cm;
        System.out.println("There are "+ci+"cubic inches in cublic mile");
    }
    public void charDemo(){
        char ch;
        ch='X';
        System.out.println("Char is "+ch);
        ch++;
        System.out.println("Char is now "+ch);
        ch=90;
        System.out.println("Char is now "+ch);
    }
}
