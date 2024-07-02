package Ex9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converting 25 USD to EUR...");
        UsdToEurConverter usdToEurConverter = new UsdToEurConverter();
        double convertedEur = convertCurrency(usdToEurConverter, 25, "USD", "EUR");
        System.out.println("Converted value: " + convertedEur + " EUR");


        System.out.println("Converting 80 EUR to THB...");
        EurToThbConverter eurToThbConverter = new EurToThbConverter();
        double convertedThb = convertCurrency(eurToThbConverter, 80, "EUR", "THB");
        System.out.println("Converted value: " + convertedThb + " THB");
    }

    public static double convertCurrency(CurrencyConverter converter, double amount, String from, String to) {
        return converter.convert(amount, from, to);
    }
}
