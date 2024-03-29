package com.javisoft.ejercicios52.ej59;

public class Ej59 {
    public static void main(String[] args) {
        Person javi = new Person("12345678W");
        Account mainAccount = new Account("000", 0.0);
        Account secondaryAccount = new Account("001", 700.0);
        javi.addAccount(mainAccount);
        javi.addAccount(secondaryAccount);

        mainAccount.addToBalance(1100.0);
        secondaryAccount.removeFromBalance(750.0);
        System.out.println(javi.status());
        
        mainAccount.pay(secondaryAccount, 800.0);
        System.out.println(javi.status());

    }
}