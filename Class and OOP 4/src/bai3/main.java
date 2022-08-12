package bai3;

import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        long startTime = 0, endTime = 0;
        StopWatch stopWatch = new StopWatch(startTime, endTime);
        stopWatch.start();
        for (int i=0;i<1000000;i++){

        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
