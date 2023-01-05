package threads;

public class RunnableExampleClient {
    public static void main(String... args) {
        System.out.println("main thread starting");
        RunnableExample re = new RunnableExample("FirstThread");
        Thread t = new Thread(re);
        t.start();
        t.setPriority (8);
        System.out.println("Thread priority"+t.getPriority());
        for(int i=0;i<20;i++){
            System.out.println("...");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println("Main Thread interrupted");
            }
            System.out.println("Terminating main thread");
        }
        System.out.println("Exiting main thread");
    }
}
