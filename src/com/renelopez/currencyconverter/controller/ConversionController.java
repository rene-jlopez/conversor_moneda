package com.renelopez.currencyconverter.controller;

import com.renelopez.currencyconverter.service.CurrencyConverter;
import com.renelopez.currencyconverter.model.Currency;

import java.util.Scanner;

public class ConversionController {
    private CurrencyConverter converter;

    public ConversionController(CurrencyConverter converter) {
        this.converter = converter;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        String menu = """
                Seleccione la conversión:
                1. USD a BRL (Real Brasileño)
                2. USD a ARS (Peso Argentino)
                3. USD a MXN (Peso Mexicano)
                4. USD a EUR (Euro)
                5. USD a CAD (Dólar Canadiense)
                6. USD a JPY (Yen Japonés)
                7. Conversión personalizada
                0. Salir
                
                Opcion:
                """;

        boolean running = true;
        while (running) {

            System.out.println("=== CONVERSOR DE MONEDAS ===");
            System.out.println(menu);

            int option;

            try {
                option = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("El dato no es correcto");
                continue;
            }


            switch(option) {

                case 1: {
                    Currency from = new Currency("USD");
                    Currency to = new Currency("BRL");
                    System.out.println("Introduce la cantidad que quieres convertir");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }

                case 2:{
                    Currency from = new Currency("USD");
                    Currency to = new Currency("ARS");
                    System.out.println("Introduce la cantidad que quieres convertir");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }
                case 3:{
                    Currency from = new Currency("USD");
                    Currency to = new Currency("MXN");
                    System.out.println("Introduce la cantidad que quieres convertir");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }

                case 4:{
                    Currency from = new Currency("USD");
                    Currency to = new Currency("EUR");
                    System.out.println("Introduce la cantidad que quieres convertir");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }
                case 5:{
                    Currency from = new Currency("USD");
                    Currency to = new Currency("CAD");
                    System.out.println("Introduce la cantidad que quieres convertir");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }

                case 6:{
                    Currency from = new Currency("USD");
                    Currency to = new Currency("JPY");
                    System.out.println("Introduce la cantidad que quieres convertir");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }

                case 7:{
                    System.out.println("=== CONVERSIÓN PERSONALIZADA ===");
                    System.out.println("Ingrese el código de la moneda origen (ej: USD): ");
                    String fromCode = in.nextLine().toUpperCase();

                    System.out.println("Ingrese el código de la moneda destino (ej: EUR): ");
                    String toCode = in.nextLine().toUpperCase();

                    Currency from = new Currency(fromCode);
                    Currency to = new Currency(toCode);

                    System.out.println("Introduce la cantidad que quieres convertir: ");
                    double amount = Double.parseDouble(in.nextLine());
                    double result = converter.convert(amount, from, to);
                    showResult(amount, from, to, result);
                    break;
                }

                case 0: {
                    System.out.println("Finalizando aplicacion...");
                    running = false;
                    break;
                }
                default:{
                    System.out.println("Por favor, asegurese de seleccionar una de las opciones anteriores.");
                }
            }
        }

        in.close();
    }
    public void showResult(double amount, Currency from, Currency to, double result) {
        System.out.println(amount + " " + from.getCode() + " = " + result + " " + to.getCode());
    }
}
