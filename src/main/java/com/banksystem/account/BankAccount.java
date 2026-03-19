package com.banksystem.account;

    public class BankAccount {
        protected double balance;
        protected String accountNumber;

        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }

        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            this.balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
            this.balance -= amount;
        }
        public double getBalance() { return balance; }
        public String getAccountNumber() { return accountNumber; }
    }
