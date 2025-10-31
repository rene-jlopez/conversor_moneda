package com.renelopez.currencyconverter.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.renelopez.currencyconverter.model.Currency;
import com.renelopez.currencyconverter.model.ExchangeRate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {

    private static final String API_KEY = "1d7f897344eba1851e50c933";
    private static final Gson gson = new Gson();

    public ExchangeRate getExchangeRate(Currency from, Currency to) throws IOException, InterruptedException {
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + from.getCode() + "/" + to.getCode()))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            if (!"success".equals(json.get("result").getAsString())) {
                throw new IOException("Error en la respuesta de la API: " + json);
            }

            double rate = json.get("conversion_rate").getAsDouble();

            return new ExchangeRate(from, to, rate);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error al obtener la tasa de cambio: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            return null;
        }
    }
}
