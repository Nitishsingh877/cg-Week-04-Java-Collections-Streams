package com.insurancepolicymgmtsystem;



        import java.nio.channels.Pipe;
                                                                                                                                    import java.time.LocalDate;
        import java.time.temporal.ChronoUnit;
        import java.util.*;

public class PolicyManager {
    private List<Policy> duplicates;
    private HashSet<Long> policyNumbers;
    private HashSet<Policy> policyHashSet;
    private LinkedHashSet<Policy> policyLinkedHashSet;
    private TreeSet<LocalDate> localDateTreeSet;

    private final LocalDate today = LocalDate.of(2025,2,13);
    public PolicyManager() {
        policyHashSet = new HashSet<>();
        policyLinkedHashSet = new LinkedHashSet<>();
        localDateTreeSet = new TreeSet<>();
        duplicates = new ArrayList<>();
        policyNumbers = new HashSet<>();
    }

    public void addPolicy(Policy policy) {
        if(policyNumbers.contains(policy.getPolicyNumber())){
            duplicates.add(policy);
        }
        policyNumbers.add(policy.getPolicyNumber());
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        localDateTreeSet.add(policy.getExpiryDate());




    }
    public  List<Policy> getUniquePolicies(){
        return policyHashSet.stream().toList();
    }
    public List<Policy> getExpiringPolicies(){
        List<Policy> policies = new ArrayList<>();
        localDateTreeSet.forEach(date -> {
            if(ChronoUnit.DAYS.between(date,today) <=30)
            {
                for (Policy policy : policyHashSet) {
                    if(policy.getExpiryDate() == date){
                        policies.add(policy);
                    }
                }
            }
        });
        return policies;
    }

    public Map<String,List<Policy>> getGroupedPolicies(){
        Map<String,List<Policy>> map = new HashMap<>();
        policyHashSet.forEach(policy -> {
            String key = policy.getCoverageType();
            if(map.containsKey(key)){
                List<Policy> policies = map.get(key);
                policies.add(policy);
                map.put(key,policies);
            }
            else{
                List<Policy> policies = new ArrayList<>();
                policies.add((policy));
                map.put(key,policies);

            }
        });
        return map;
    }

    public List<Policy> getDuplicatePolicies(){
        return duplicates;
    }
}
