package concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock myRl = new ReentrantLock();
        new Thread(new LockThread(myRl,"One")).start();
        new Thread(new LockThread(myRl,"Two")).start();

    }
}

class LockThread implements Runnable{
    String name;
    ReentrantLock rl;
    LockThread(ReentrantLock lock,String a){
        rl=lock;
        name=a;
    }

    @Override
    public void run() {
        System.out.println("LockThread.run");
        try{
            System.out.println(name+"is waiting");
            rl.lock();
            Shared.count++;
            System.out.println("sleeping");
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
        finally{
            rl.unlock();
        }
    }
}
