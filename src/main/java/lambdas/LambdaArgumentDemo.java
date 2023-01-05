package lambdas;

public class LambdaArgumentDemo {
    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String input = "Lambdas are Fun";
        String output;
        System.out.println(input);
        StringFunc reverse=(str)->{
          String result = "";
          for(int i=str.length()-1; i>=0;i--){
              result+=str.charAt(i);
          }
          return result;
        };
        output=changeStr (reverse,input);
        System.out.println(output);
    }
}

interface StringFunc{
    String func(String s);
}
