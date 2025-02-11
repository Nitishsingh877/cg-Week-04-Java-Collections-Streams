package aidrivenresumescreeningsystem;

public class aidrivenscreening {
    public static void main(String[] args) {
        Company company = new Company();

        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("nitish singh",85,new SoftwareEngineer());
        Resume<ProductManager> productManagerResume = new Resume<>("siddhu" , 85,new ProductManager());
        Resume<DataScientist> dataScientistResume = new Resume<>("Neha",98,new DataScientist());


        company.addResume(softwareEngineerResume);
        company.addResume(productManagerResume);
        company.addResume(dataScientistResume);

        softwareEngineerResume.displayResumeDetails();
        productManagerResume.displayResumeDetails();
        dataScientistResume.displayResumeDetails();

        System.out.println("----------");


        company.displayResume();
    }
}
