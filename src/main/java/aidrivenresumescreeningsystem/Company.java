package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume){
        resumeList.add(resume);
    }

    public List<Resume<? extends JobRole>> getResumeList() {
        return resumeList;
    }

    public void displayResume(){
        System.out.println("resume : ");
        for (Resume<? extends JobRole> resume : resumeList){
            System.out.println(resume.getType().getClass());
        }
    }
}
