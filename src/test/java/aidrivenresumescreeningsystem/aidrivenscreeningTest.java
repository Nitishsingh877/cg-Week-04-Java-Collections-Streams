package aidrivenresumescreeningsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class aidrivenscreeningTest {
    Company company;

    @BeforeEach
    void setup(){
        company = new Company();
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("nitish singh",85,new SoftwareEngineer());
        Resume<ProductManager> productManagerResume = new Resume<>("siddhu" , 85,new ProductManager());
        Resume<DataScientist> dataScientistResume = new Resume<>("Neha",98,new DataScientist());

        company.addResume(softwareEngineerResume);
        company.addResume(productManagerResume);
        company.addResume(dataScientistResume);
    }

    @Test
    void numberOfresume(){
        assertEquals(3,company.getResumeList().size(), "size is not equal");
        System.out.println("size is equal");
    }

    @Test
    void ATSCheckForDS(){
        assertEquals(98,company.getResumeList().get(2).getATSscore(),"ats is not equal");
        System.out.println("ats is equal");
    }

    @Test
    void nameCheckForSE(){
        assertEquals("Nitish singh", company.getResumeList().get(0).getName(),"name not matched");
        System.out.println("name matched");
    }




}