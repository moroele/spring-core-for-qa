package com.acme.banking.dbo.ooad;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
@Service
public class ReportingService {
    @Autowired
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
