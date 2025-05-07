package se.iths.java24;


import se.iths.java24.CurrencyConverter;
import se.iths.java24.ConverterName;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<CurrencyConverter> converters = ServiceLoader.load(CurrencyConverter.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());

        ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);

        for (CurrencyConverter converter : loader) {
            System.out.println("Loaded: " + converter.getClass().getName());
        }

        if (converters.isEmpty()) {
            System.out.println("No currency converters found.");
            return;
        }

        System.out.println("Available Converters:");
        for (int i = 0; i < converters.size(); i++) {
            CurrencyConverter converter = converters.get(i);
            String name = converter.getClass().isAnnotationPresent(ConverterName.class)
                    ? converter.getClass().getAnnotation(ConverterName.class).value()
                    : converter.getClass().getSimpleName();
            System.out.printf("[%d] %s%n", i + 1, name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose converter: ");
        int choice = scanner.nextInt() - 1;

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double result = converters.get(choice).convert(amount);
        System.out.println("Converted amount: " + result);
    }
}
