package com.acme.banking.dbo.ooad;

public class NostalgieXchangeService implements XchangeService {
    private double rate;

    public NostalgieXchangeService(double rate) {
        this.rate = rate;
    }

    @Override
    public double getRate() {
        return rate;
    }
}
