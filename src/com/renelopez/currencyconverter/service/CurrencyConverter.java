package com.renelopez.currencyconverter.service;

import com.renelopez.currencyconverter.model.Currency;
import com.renelopez.currencyconverter.model.ExchangeRate;

public class CurrencyConverter {

    private ExchangeRateAPI apiService;

    public CurrencyConverter(ExchangeRateAPI apiService) {
        this.apiService = apiService;
    }

    public double convert(double amount, Currency from, Currency to) {

        try{
            ExchangeRate exchangeRate = apiService.getExchangeRate(from, to);

            if (exchangeRate == null) {
                System.err.println("No se pudo obtener la tasa de cambio");
                return 0.0;
            }
            double rate = exchangeRate.getRate();
            return amount * rate;

        } catch (Exception e) {
            System.err.println("Error al convertir: " + e.getMessage());
            return 0.0;
        }

    }
}
