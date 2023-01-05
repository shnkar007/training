package operators;





public class EnumDemo {
   /* public enum States {
        TAMILNADU,KARNATAKA,KERALA,ANDHRAPRADESH,TELANGANA,PUDUCHERRY;
    }*/


     public static void main(String... args) {
        States state;
         States state1=States.TELANGANA;
         States stateString = state1.valueOf ("TELANGANA");
         System.out.println("The state string is "+stateString);
         if(state1.name ().equals("TELANGANA")){
             System.out.println("Welcome to Hyderabad");
             System.out.println("Telangana code is "+state1.getState ());
         }
         state=States.TAMILNADU;
         System.out.println("the position of Karnataka"+state.ordinal ());
         System.out.println("the position of Karnataka"+state.equals ("TAMILNADU"));
        if(state.equals("Karnataka")){
            System.out.println("Not Equal");
        }
         System.out.println("the position of Karnataka"+state.ordinal ());
         switch (state) {
             case TAMILNADU:
                 System.out.println ("TamilNadu");
                 break;
             case TELANGANA:
                 System.out.println ("Telangana");
                 break;
             case KARNATAKA:
                 System.out.println(States.valueOf ("KARNATAKA"));
                  break;
              default:
                 System.out.println ("Karnataka");
                 break;

         }
        System.out.println(state.compareTo (States.valueOf("TAMILNADU")));
     }
}
