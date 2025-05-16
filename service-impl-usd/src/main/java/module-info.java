import se.iths.java24.impl.usd.UsdToSekConverter;

module service.impl.usd {
    requires service.api;
    provides se.iths.java24.CurrencyConverter
            with se.iths.java24.impl.usd.UsdToSekConverter;
}