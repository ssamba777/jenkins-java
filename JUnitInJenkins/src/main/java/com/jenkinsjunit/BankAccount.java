package com.jenkinsjunit;

/**
 * Hello world!
 *
 */
public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;
    private String holderName;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getHolderName() {
        return holderName;
    }

    public double withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double deposit(double amount) {
//        try {
//            Thread.sleep(5);
//        } catch (InterruptedException e) {}

        return balance += amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
