package threads;

public class RunnableExample implements Runnable{
    String threadName;
    public RunnableExample(String name){
        this.threadName=name;
    }
    @Override
    public void run() {
        System.out.println("Starting ====>"+threadName);
        try{
            for(int count=0;count<10;count++){
                Thread.sleep(200);
                System.out.println("In "+threadName+"Count is ===>"+count);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupting "+threadName);
        }
    }
}
