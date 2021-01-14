package com.javisoft.ejercicios52.ej59;

public class Account {
    private final String accountID;
    private double balance;

    public Account(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addToBalance(double amount) {
        setBalance(getBalance() + amount);
    }

    public void removeFromBalance(double amount) {
        setBalance(getBalance() - amount);
    }

    public void pay(Account recipient, double amount) {
        this.removeFromBalance(amount);
        recipient.addToBalance(amount);
    }

    public void getPaid(Account issuer, double amount) {
        issuer.pay(this, amount);
    }
}
