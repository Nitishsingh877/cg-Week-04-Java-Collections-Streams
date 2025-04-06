package aidrivenresumescreeningsystem;

public abstract class JobRole {
    private String type;

    public JobRole(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void displayDetails();
}
