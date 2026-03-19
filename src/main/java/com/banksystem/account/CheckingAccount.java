package com.banksystem.account;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        if (amount > balance + overdraftLimit)
            throw new IllegalArgumentException("Overdraft limit exceeded");
        this.balance -= amount;
    }

    public double getOverdraftLimit() { return overdraftLimit; }
}