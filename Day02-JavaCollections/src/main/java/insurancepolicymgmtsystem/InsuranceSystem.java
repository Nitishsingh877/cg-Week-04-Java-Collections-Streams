package insurancepolicymgmtsystem;

import java.time.LocalDate;

public class InsuranceSystem {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P001","Alice", LocalDate.of(2025,3,15)));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.of(2025, 2, 20)));
        manager.addPolicy(new Policy("P003", "Alice", LocalDate.of(2025, 4, 10)));
        manager.addPolicy(new Policy("P004", "Carol", LocalDate.of(2024, 12, 1)));

        System.out.println("Policy P002: " + manager.getPolicyNumber("P002"));
        System.out.println("-------------");
        System.out.println("Policies expiring in next 30 days : " + manager.getPoliciesExpiringSoon(30));
        System.out.println("----------------");
        System.out.println("Policies for Alice " + manager.getPolicyByHolder("Alice"));


        System.out.println("removing expired policies");
        manager.removeExpiredPolicies();

        manager.displayPolicies();
    }
}
