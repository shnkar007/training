package concurrent;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool (2 );
        Future<Integer> f;
        Future<Double> f2;

        System.out.println("starting");
        f=es.submit(new Sum(10));
        f2=es.submit(new Hypot(3,5));
        try{
            System.out.println(f.get());
            System.out.println(f2.get());

        } catch (ExecutionException e) {
            e.printStackTrace ( );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        es.shutdown ();
    }
}
class Sum implements Callable<Integer> {
    int stop;
    Sum(int v){
        stop=v;
    }
    @Override
    public Integer call() throws Exception {
         int sum = 0;
         for(int i=1;i<=stop;i++){
             sum+=i;
         }
        return sum;
    }
}
 class Hypot implements Callable<Double>{
    double side1,side2;
    Hypot(double s1,double s2){
        side1=s1;
        side2=s2;
    }
    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1*side1)+(side2*side2));
    }
 }
