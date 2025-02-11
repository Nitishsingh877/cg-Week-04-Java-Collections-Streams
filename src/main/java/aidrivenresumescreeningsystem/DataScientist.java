package aidrivenresumescreeningsystem;

public class DataScientist extends  JobRole{
    public DataScientist() {
        super("DataScientist");
    }


    @Override
    public void displayDetails() {
        System.out.println(getType());
    }
}
