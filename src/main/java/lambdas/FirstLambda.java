package lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleUnaryOperator;

public class FirstLambda {
    public static void main(String[] args) {
         MyValue myVal;
         paramVal pVal;
         int num1=10;
         myVal=()->Math.random()*100;
         System.out.println(myVal.getValue ());
         pVal=(n)->10.0/n;
       //  System.out.println(pVal.getValue (2.0));

        DoubleToIntFunction doubleToIntFunction = var -> {
            int result = 1;
            int n = 10;
            for (int i = 0; i < 10; i++) {
                if ((n % i) == 0) {
                    result = i;
                }
            }
            return result;
        };
         VarCap varCap=(num)->{
            int v = num1+num;
          return v;
        };
     //System.out.println(doubleToIntFunction);
     System.out.println(varCap.fetch (50));
    }
}

interface MyValue{
    double getValue();
}
interface paramVal{
    double getValue(double v);
}
interface VarCap{
    int fetch(int a);
}