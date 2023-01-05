package threads;

public class ThreadExampleClient {
    public static void main(String... args) {
        System.out.println("main thread starting");
        ThreadExample te = new ThreadExample("FirstThread");
        te.start();
        for(int i=0;i<20;i++){
            System.out.println("...");
            try{
                Thread.sleep(1000);
                System.out.println("Interruption status  "+te.isInterrupted ());
            }catch(InterruptedException e){
                System.out.println("Main Thread interrupted");
            }
        }
        System.out.println("Exiting main thread");
    }
}
