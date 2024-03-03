package com.directi.training.isp.exercise_refacto;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, final TimeoutCallback door) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
