package com.acme.banking.dbo.ooad;

import com.acme.banking.dbo.ooad.ReportingService;

import java.util.Collection;

public class FrameworkApp {
    public static void main(String[] args) {
        ReportingService reportingService = new ReportingService(
                new NostalgieXchangeService(30),
                new ManuallyEnteredAccountRepository()
        );
        Collection<Account> accounts = reportingService.getAllAccountsinUsd();
        accounts.forEach(account -> System.out.println(account.getOverdraft()));
        System.out.println(
                ">>>>>>"
        );
        accounts.forEach(account -> System.out.println(account.getAmount()));
    }
}
