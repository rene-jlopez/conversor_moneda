package com.renelopez.currencyconverter.model;

public class ExchangeRate {
    private Currency baseCurrency;
    private Currency targetCurrency;
    private double rate;

    public ExchangeRate (Currency baseCurrency, Currency targetCurrency,double rate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
