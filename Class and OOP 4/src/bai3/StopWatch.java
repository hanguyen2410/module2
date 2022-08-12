package bai3;

import java.time.LocalTime;

public class StopWatch {
    long starTime, endTime;

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

//    public void starTime() {
//        System.out.println(LocalTime.now());
//    }

    public void start() {
        starTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - starTime;
    }
}

