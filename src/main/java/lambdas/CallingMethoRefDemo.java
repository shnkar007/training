package lambdas;

public class CallingMethoRefDemo {
    static boolean booltest(IntTest ref, int a) {
        return ref.test (a);
    }

    public static void main(String[] args) {
        boolean result;
        result = booltest (MethodReferenceDemo::isPrime, 8);
        if(result) System.out.println(result);
    }
}