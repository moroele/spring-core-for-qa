package com.acme.banking.dbo.ooad;

public class SavingAccount implements Account {
    protected long id;
    protected double amount;

    SavingAccount(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public double getOverdraft() {
        return 0;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }


}
