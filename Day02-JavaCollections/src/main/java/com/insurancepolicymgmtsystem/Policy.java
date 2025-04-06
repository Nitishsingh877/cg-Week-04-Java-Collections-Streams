package com.insurancepolicymgmtsystem;


import java.time.LocalDate;

public class Policy {
    private long policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private int amount;

    public Policy(long policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, int amount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.amount = amount;
    }

    public long getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", amount=" + amount +
                '}';
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public int getAmount() {
        return amount;
    }
}
