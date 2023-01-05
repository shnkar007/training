package threads;

public class JoinDemo {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample("FirstThread");
        ThreadExample t2 = new ThreadExample("SecondThread");
        ThreadExample t3 = new ThreadExample("ThirdThread");
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException ex){
            System.out.println("Interrupted Exception occurred");
        }
    }
}
