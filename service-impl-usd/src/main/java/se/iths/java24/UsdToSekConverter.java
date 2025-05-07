package se.iths.java24;

import se.iths.java24.CurrencyConverter;
import se.iths.java24.ConverterName;

@ConverterName("USD to SEK")
public class UsdToSekConverter implements CurrencyConverter {
    public double convert(double amount) {
        return amount * 10.5;
    }
}