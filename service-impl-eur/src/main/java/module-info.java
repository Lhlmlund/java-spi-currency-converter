import se.iths.java24.impl.eur.EurToSekConverter;

module service.impl.eur {
    requires service.api;
    provides se.iths.java24.CurrencyConverter
            with se.iths.java24.impl.eur.EurToSekConverter;
}
