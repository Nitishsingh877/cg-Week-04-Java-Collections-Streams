package com.nitish.excersize.repeatableannotations;

public class TaskManger {
    @BugReport(description = "Bug 1 : null pointer exceptions.")
    @BugReport(description = "bug 2 : performance degradation in task processing.")
    public void processTask(){
        System.out.println("Processing task...");
    }
}
