package se.iths.java24.impl.eur;

import se.iths.java24.CurrencyConverter;
import se.iths.java24.ConverterName;

@ConverterName("EUR to SEK")
public class EurToSekConverter implements CurrencyConverter {
    public double convert(double amount) {
        return amount * 11.3;
    }
}