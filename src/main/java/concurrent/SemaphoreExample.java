package concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore sem1 = new Semaphore (1);
        new Thread(new IncThread(sem1,"A")).start();
        new Thread(new DecThread(sem1,"B")).start();
    }

}
class Shared{
    static int count = 0;
}

class IncThread implements Runnable {
    String name;
    Semaphore sem1;

    IncThread(Semaphore s, String n) {
        sem1 = s;
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Starting "+name);
        System.out.println ("Wait for permit");
        try {
            sem1.acquire ( );
            for (int i = 0; i < 10; i++) {
                Shared.count++;
                System.out.println ("Count is " + Shared.count);
                Thread.sleep (10);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace ( );
        }
        sem1.release ( );
        System.out.println ("Sempahore released");
    }
}
class DecThread implements Runnable {
    String name;
    Semaphore sem1;

    DecThread(Semaphore s, String n) {
        sem1 = s;
        name = n;
    }

    @Override
    public void run() {
        System.out.println("Starting "+name);
        System.out.println ("Wait for permit");
        try {
            sem1.acquire ( );
            for (int i = 0; i < 10; i++) {
                Shared.count--;
                System.out.println ("Count is " + Shared.count);
                Thread.sleep (10);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace ( );
        }
        sem1.release ( );
        System.out.println ("Sempahore released");
    }
}
