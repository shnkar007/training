package misc;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo  {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {}

        timer.cancel();
    }
}

class MyTask extends TimerTask{
    public void run() {
        System.out.println("Timer task executed.");
    }
}
