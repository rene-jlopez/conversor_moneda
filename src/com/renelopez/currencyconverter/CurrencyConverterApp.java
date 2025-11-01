package com.renelopez.currencyconverter;

import com.renelopez.currencyconverter.controller.ConversionController;
import com.renelopez.currencyconverter.service.CurrencyConverter;
import com.renelopez.currencyconverter.service.ExchangeRateAPI;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        ExchangeRateAPI api = new ExchangeRateAPI();
        CurrencyConverter converter = new CurrencyConverter(api);
        ConversionController controller = new ConversionController(converter);
        controller.run();
    }
}
