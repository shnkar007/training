package lambdas;

public class MethodReferenceDemo {
    //IntTest tes;
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<n/i;i++){
            if((n%i)==0) return false;

        }
        return true;
    }
 static  boolean numTest( int v){
        return isPrime(v);
    }


}

interface IntTest{
    boolean test( int a);
}