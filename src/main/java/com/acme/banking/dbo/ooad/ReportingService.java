package com.acme.banking.dbo.ooad;

import java.util.Collection;

public class ReportingService {
    private XchangeService xchangeService;
    private AccountRepository accountRepository;

    public ReportingService(XchangeService xchangeService, AccountRepository accountRepository) {
        this.xchangeService = xchangeService;
        this.accountRepository = accountRepository;
    }

    public Collection<Account> getAllAccountsinUsd() {
        Collection<Account> allAcounts = accountRepository.getAllAcounts();
        allAcounts.forEach(a -> a.setAmount(a.getAmount() / xchangeService.getRate()));
        return allAcounts;
    }
}
