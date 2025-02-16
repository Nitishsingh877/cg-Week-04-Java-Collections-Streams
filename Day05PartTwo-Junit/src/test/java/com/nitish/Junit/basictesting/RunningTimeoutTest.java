package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class RunningTimeoutTest {
    RunningTimeout runningTimeout = new RunningTimeout();

    @Test
    @Timeout(4)
    void longRunningTask() throws InterruptedException {
        assertEquals("slept",runningTimeout.longRunningTask(),"Methods taking longer time than excepted.");
    }
}