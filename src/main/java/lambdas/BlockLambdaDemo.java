package lambdas;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc testFunc = (n)->{
          int result=1;
          n = n<0?-n:n;
          for(int i=2;i<=n/i;i++){
              if(n%i==0){
                  result=i;
                  break;
              }
          }
          return result;
        };// end of lambda;
        System.out.println("Smallest Factor of 12 is "+testFunc.func (12));
        System.out.println("Smallest Factor of 50 is"+testFunc.func (33));
    }
}

interface NumericFunc{
    int func(int n);
}
