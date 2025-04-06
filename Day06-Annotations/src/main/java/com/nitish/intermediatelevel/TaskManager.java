package com.nitish.intermediatelevel;

public class TaskManager {
    @LogExecutionTime
    public void task1() {
        try {
            Thread.sleep(100); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void task2() {
        try {
            Thread.sleep(200); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void task3() {
        try {
            Thread.sleep(300); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
