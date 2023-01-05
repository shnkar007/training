package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CBarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3,new BarAction());
        new Thread(new BarThread (cb,"A")).start();
        new Thread(new BarThread (cb,"B")).start();
        new Thread(new BarThread (cb,"C")).start();
    }

}
class BarThread implements Runnable{
    CyclicBarrier cb1;
    String name;
    BarThread(CyclicBarrier c, String n){
        cb1=c;
        name=n;
    }
    @Override
    public void run() {
      System.out.println(name);
        try {
            cb1.await ();
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        } catch (BrokenBarrierException e) {
            e.printStackTrace ( );
        }
    }
}
