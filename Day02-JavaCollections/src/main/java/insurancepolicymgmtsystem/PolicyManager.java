package insurancepolicymgmtsystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Map<String,Policy> policyMap = new HashMap<>();
    private Map<String,Policy> orderedPolicy = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> sortedPolicy = new TreeMap<>();


    public void addPolicy(Policy policy){
        policyMap.put(policy.getPolicyNumber(),policy);
        orderedPolicy.put(policy.getPolicyHolder(),policy);

        sortedPolicy.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    public Policy getPolicyNumber(String policyNumber){
        return policyMap.get(policyNumber);
    }

   public List<Policy> getPolicyByHolder(String holderName){
        List<Policy> policies = new ArrayList<>();
        for(Policy policy : policyMap.values()){
            if(policy.getPolicyHolder().equalsIgnoreCase(holderName)){
                policies.add(policy);
            }
        }return policies;
   }

    public List<Policy> getPoliciesExpiringSoon(int days){
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate targetDate = today.plusDays(days);

        for (Map.Entry<LocalDate,List<Policy>> entry : sortedPolicy.subMap(today,targetDate).entrySet()) {
            expiringPolicies.addAll(entry.getValue());
        }return expiringPolicies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Policy policy = it.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                it.remove();
                orderedPolicy.remove(policy.getPolicyNumber());
                sortedPolicy.get(policy.getExpiryDate()).remove(policy);
                if (sortedPolicy.get(policy.getExpiryDate()).isEmpty()) {
                    sortedPolicy.remove(policy.getExpiryDate());
                }
            }
        }
    }

    public void displayPolicies() {
        System.out.println("All Policies:");
        for (Policy policy : policyMap.values()) {
            System.out.println(policy);
        }
    }


}
