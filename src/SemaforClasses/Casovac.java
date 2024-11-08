package SemaforClasses;

import java.util.Timer;
import java.util.TimerTask;

public class Casovac {
    private Timer timer;
    private Runnable task;

    public Casovac(Runnable task) {
        this.task = task;
        this.timer = new Timer();
    }

    public void start() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                task.run();
            }
        }, 0, 1000);
    }

    public void stop() {
        timer.cancel();
        System.out.println("Timer stopped.");
    }
}
