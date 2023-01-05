package concurrent;

// Java program to show Phaser Class

import java.util.concurrent.Phaser;

// A thread of execution that uses a phaser.
class MyThread implements Runnable {
    Phaser phaser;
    String title;

    public MyThread(Phaser phaser, String title)
    {
        this.phaser = phaser;
        this.title = title;

        phaser.register();
        new Thread(this).start();
    }

    @Override public void run()
    {
        System.out.println("Thread: " + title
                + " Phase Zero Started");
        phaser.arriveAndAwaitAdvance();

        // Stop execution to prevent jumbled output
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread: " + title
                + " Phase One Started");
        phaser.arriveAndAwaitAdvance();

        // Stop execution to prevent jumbled output
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread: " + title
                + " Phase Two Started");
        phaser.arriveAndDeregister();
    }
}

public class PhaserDemo {
    public static void main(String[] args)
    {
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;

        System.out.println("Starting");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        // Wait for all threads to complete phase Zero.
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase Zero Ended");

        // Wait for all threads to complete phase One.
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase One Ended");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Complete");
        System.out.println("Phase Two Ended");

        // Deregister the main thread.
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("Phaser is terminated");
        }
    }
}
