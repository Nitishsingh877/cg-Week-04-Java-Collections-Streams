package com.insurancepolicymgmtsystem;



import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Policy p1 = new Policy(1232,"Siddhu", LocalDate.of(2025,2,17),"Health",500000);
        Policy p2 = new Policy(1233, "Karan",LocalDate.of(2025,2,19),"AIDS",100000);
        Policy p3 = new Policy(1234,"Nitish", LocalDate.of(2025,3,21),"Term Life", 2000000);
        Policy p4 = new Policy(1234, "Sumit", LocalDate.of(2025,2,20), "Accidental",1200000);
        Policy p5 = new Policy(1236, "Aryan",LocalDate.of(2025,3,24), "Term Life", 5000000);


        PolicyManager policyManager = new PolicyManager();
        policyManager.addPolicy(p1);
        policyManager.addPolicy(p2);
        policyManager.addPolicy(p3);
        policyManager.addPolicy(p4);
        policyManager.addPolicy(p5);

        System.out.println(policyManager.getDuplicatePolicies());
        policyManager.getExpiringPolicies().forEach(policy -> System.out.println(policy+"\n"));
        policyManager.getGroupedPolicies().forEach((key,value)->{
            System.out.println(key+" : "+value);
            System.out.println();
        });





    }
}