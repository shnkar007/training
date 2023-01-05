package threads;

public class Priority implements Runnable{
    int count;
    Thread myThread;
    static boolean stop = false;
    static String currentName;
    Priority(String name){
        myThread = new Thread(this,name);
        count =0;
        currentName=name;
    }
    public void run(){
        System.out.println("starting "+myThread.getName());
        do{
            count++;
            if(currentName.compareTo (myThread.getName())!=0){
                 currentName=myThread.getName();
                 System.out.println("the current name is "+currentName);
            }
        }while(stop==false && count<10000000);
        stop=true;
    }
}
