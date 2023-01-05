package threads;

public class IsAliveDemo {
    RunnableExample t1 = new RunnableExample("FirstThread");
    RunnableExample t2 = new RunnableExample("SecondThread");
    RunnableExample t3 = new RunnableExample("ThirdThread");
    Thread tOne = new Thread(t1);
    Thread tTwo = new Thread(t2);
    Thread tThree = new Thread(t3);

   /* do{

        System.out.println("...");
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Main Thread interruptd");
        }
    }while(tOne)*/
}
