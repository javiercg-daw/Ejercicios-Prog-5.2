package com.javisoft.ejercicios52.ej59;

import java.util.ArrayList;

public class Person {
    private final String personID;
    private ArrayList<Account> accounts;

    public Person(String personID) {
        this.personID = personID;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        if (this.accounts.contains(account)) {
            return;
        }
        if (accounts.size() < 3) {
            accounts.add(account);
        }
    }

    public boolean isDefaulter() {
        for (Account acc : accounts) {
            if (acc.getBalance() < 0.0) {
                return true;
            }
        }
        return false;
    }

    public String status() {
        return isDefaulter() ? "Defaulter" : "Non-defaulter";
    }
}
