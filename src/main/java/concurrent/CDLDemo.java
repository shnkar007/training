package concurrent;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch myLatch= new CountDownLatch(5);
        System.out.println("Starting the latch from main");
        new Thread(new CDLThread (myLatch)).start();
        try{
            myLatch.await ();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("terminating");
    }
}
class CDLThread implements Runnable{
    CountDownLatch latch;
    CDLThread(CountDownLatch a){
        latch=a;
    }

    @Override
    public void run() {
      for(int i=0;i<5;i++){
          System.out.println("i "+i);
          latch.countDown();
      }
    }
}
