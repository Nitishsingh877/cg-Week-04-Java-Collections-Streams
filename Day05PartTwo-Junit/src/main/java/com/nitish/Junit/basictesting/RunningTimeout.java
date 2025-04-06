package com.nitish.Junit.basictesting;

public class RunningTimeout {
    public  String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "slept";
    }
}
