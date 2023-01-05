package exception;

public class CustomException extends Exception{
   public CustomException(){
       super();

       System.out.println("My own exception");
       studentNotFoundException ();
   }
    public String studentNotFoundException(){
        System.out.println("Custom Exception occured");
        return "student does not exist";
    }
}
