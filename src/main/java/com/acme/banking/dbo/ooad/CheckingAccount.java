package com.acme.banking.dbo.ooad;

public class CheckingAccount extends SavingAccount {
    private double overdraft;

    public CheckingAccount(long id, double amount, double overdraft) {
        super(id, amount);
        this.overdraft = overdraft;
    }


    public double getOverdraft() {
        return overdraft;
    }
}
