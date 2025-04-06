package aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole{

    public SoftwareEngineer() {
        super("SoftwareEngineer");
    }

    @Override
    public void displayDetails() {
        System.out.println(getType());
    }
}
