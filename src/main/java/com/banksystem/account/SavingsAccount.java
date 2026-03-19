package com.banksystem.account;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private LocalDate maturityDate;

    public SavingsAccount(String accountNumber, double interestRate, LocalDate maturityDate) {
        super(accountNumber);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public boolean isMature() {
        return LocalDate.now().isAfter(maturityDate);
    }

    public double getInterestRate() { return interestRate; }
    public LocalDate getMaturityDate() { return maturityDate; }
}