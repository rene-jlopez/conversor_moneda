# Proyecto conversor de moneda

![Wallpaper](./assets/img/CurrencyImage.jpg)

![Static Badge](https://img.shields.io/badge/powered_by-Oracle-C34131?style=for-the-badge)
![Static Badge](https://img.shields.io/badge/alura-051933?style=for-the-badge)

## Descripción

Una aplicación de conversión de monedas desarrollada en Java que permite convertir cantidades entre diferentes divisas utilizando tasas de cambio actualizadas.

## Características

- Conversión entre múltiples monedas

- Arquitectura modular y escalable

- Utiliza una API de tasas de cambio

- Interfaz de línea de comandos (CLI)

## Tecnologías Utilizadas

- Lenguaje: Java

- Paradigma: Programación Orientada a Objetos (POO)

##  Estructura del Proyecto

src/  
├── model/  
│   ├── Currency.java  
│   └── ExchangeRate.java  
├── service/  
│   ├── ExchangeRateAPI.java  
│   └── CurrencyConverter.java  
├── controller/  
│   └── ConversionController.java  
└── CurrencyConverterApp.java  

## Prerrequisitos

- Java JDK 17 o superior

- Biblioteca Gson 2.10.1 en adelante

- IDE como IntelliJ IDEA

## Uso

- Ejecuta la aplicación

- Selecciona la moneda de origen

- Selecciona la moneda de destino

- Ingresa la cantidad a convertir

- Visualiza el resultado de la conversión