package com.acme.banking.dbo.ooad;

import java.util.ArrayList;
import java.util.Collection;

public class ManuallyEnteredAccountRepository implements AccountRepository{
    private Collection<Account> accounts = new ArrayList<>();

    @Override
    public Collection<Account> getAllAcounts() {
        return accounts;
    }

    public ManuallyEnteredAccountRepository() {
        accounts.add(new SavingAccount(1, 100));
        accounts.add(new SavingAccount(2, 200));
        accounts.add(new CheckingAccount(3, 300, 100));
    }
}
