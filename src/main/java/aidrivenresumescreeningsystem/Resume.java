package aidrivenresumescreeningsystem;

public class Resume <T extends JobRole>{
    private String name;
    private int ATSscore;

    private T type;

    public Resume(String name, int ATSscore, T type) {
        this.name = name;
        this.ATSscore = ATSscore;
        this.type = type;
    }

    public String getString(){
        return getClass().toString();
    }
    public T getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getATSscore() {
        return ATSscore;
    }

       public void displayResumeDetails(){
           System.out.println("Name is " + getName());
           System.out.println("ATS score is : " + getATSscore());
           type.displayDetails();
       }
}
