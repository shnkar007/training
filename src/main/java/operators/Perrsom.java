package operators;

public class Perrsom {
    // int i=100;
    private String name;
    private String[] nickname;
    public Perrsom (String name, String... nickname ){
        this.name=name;
        this.nickname= nickname;
        for(String nm: nickname){
            System.out.println(nm);
        }

    }
    public static void main(String... args){
        //Perrsom p = new Perrsom("Sankar","San","Sank");
        Perrsom p2 = new Perrsom("Venkatesh","Venky","Venkat");
       // p2.displayName ("Sankar");
       // p2.displayName (p2);
        System.out.println(Comstants.UPPER_LIMIT);
    }
    //Overloading Method
    public void displayName(String name){
        System.out.println(name);
    }
    //Overloading Method 2
      public Perrsom displayName(Perrsom p){
          for(String nm: nickname){
              System.out.println(nm);
          }
          return p;
      }
}
