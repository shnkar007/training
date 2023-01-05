package threads;

public class SleepDemo {
    public static void main(String... args) {
        Thread t = Thread.currentThread();
        t.setName("SankarThread");
        System.out.println("in "+t.getName ());
        try{
            for(int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}
