package threads;

public class ThreadExample extends Thread{
    String threadName;
    public ThreadExample(String name){
       super(name);
    }
    public void run(){
        System.out.println("Starting ====>"+getName());
        try{
            for(int count=0;count<10;count++){
                Thread.sleep(200);
                System.out.println("In "+getName()+"Count is ===>"+count);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupting "+getName());
        }
    }
}
