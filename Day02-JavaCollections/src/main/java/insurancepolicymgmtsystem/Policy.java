package insurancepolicymgmtsystem;

public class Policy {
    private String policyNumber;
    private String policyHolder;
    private String expiryDate;

    public Policy(String policyNumber, String policyHolder, String expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    @Override
    public String toString() {
        return "Policy " +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolder='" + policyHolder + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
