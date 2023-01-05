package lambdas;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        DoubleNumericArrayFunc myFunc=(n)->{
            double entry =0.0;
            if(n.length==0){
                throw new Exception();
            }
            for(int i=0;i<n.length;i++){
                entry+=n[i];
            }
            return entry/n.length;
        };
        double[] arr = {1.0,2.0,3.0};
      System.out.println(myFunc.func(arr));
    }
}

interface DoubleNumericArrayFunc{
    double func(double[] n) throws Exception;
}
