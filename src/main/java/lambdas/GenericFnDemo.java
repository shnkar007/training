package lambdas;

import java.security.spec.RSAOtherPrimeInfo;

public class GenericFnDemo {
    public static void main(String[] args) {
        MyTest<Integer> isFactor = (n,d)->(n%d)==0;
        if(isFactor.test(20,4)){
            System.out.println("4 is a factor of 20");
        }else{
            System.out.println("Not a factor");
        }
        MyTest<String> partOf= (a,b)->a.indexOf (b)!=-1;
        String str= "Generic Functional Interface";
        System.out.println(str);
        if(partOf.test(str,"Inter")){
            System.out.println(" found");
        }else{
            System.out.println("not a part of the string");
        }
    }


}

interface MyTest<T>{
    boolean test(T t1,T t2);
}