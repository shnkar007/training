package threads;

public class SetPriorityDemo {
    public static void main(String[] args) {

        Priority p = new Priority("myThread0");
        Priority p1 = new Priority("myThread1");
        Priority p2 = new Priority("myThread2");
        Priority p3 = new Priority("myThread3");
        Priority p4 = new Priority("myThread4");
        Priority p5 = new Priority("myThread5");
        Thread thread = new Thread(p);
        Thread thread0 = new Thread(p1);
        Thread thread1 = new Thread(p2);
        Thread thread2 = new Thread(p3);
        Thread thread3 = new Thread(p4);
        Thread thread4 = new Thread(p5);
        thread.setPriority(Thread.NORM_PRIORITY+3);
        thread0.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY-3);
        thread2.setPriority(Thread.NORM_PRIORITY-4);
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Priority is "+thread.getPriority());
      //  thread.start();
      //  thread0.start();
       // thread1.start();
       // thread2.start();
        //thread3.start();
        thread4.start();
        System.out.println("Priority===>"+thread4.isAlive ());
        try{
          //  thread.join();
           // thread0.join();
           // thread1.join();
            //thread2.join();
            //thread3.join();
            thread4.join();
        } catch(InterruptedException e){
            System.out.println("IE");
        }
        System.out.println("High priority thread counts to "+p.count);
        System.out.println("Normal priority thread counts to "+p1.count);
    }
}
