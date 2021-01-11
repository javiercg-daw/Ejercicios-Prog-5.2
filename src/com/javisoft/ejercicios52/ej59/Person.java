package com.javisoft.ejercicios52.ej59;

import java.util.ArrayList;

public class Person {
    private String personID;
    private ArrayList<Account> accounts;

    public Person(String personID) {
        this.personID = personID;
        this.accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        if (this.accounts.contains(account)) {
            return false;
        }
        if (accounts.size() < 3) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    public boolean isDefaulter() {
        for (Account acc : accounts) {
            if (acc.getBalance() < 0.0) {
                return true;
            }
        }
        return false;
    }

}
