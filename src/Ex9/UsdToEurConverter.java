package Ex9;

public class UsdToEurConverter implements CurrencyConverter{
    private double curEurRate = 0.93;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!fromCurrency.equalsIgnoreCase("USD") || !toCurrency.equalsIgnoreCase("EUR")) {
            System.out.println("This converter only converts USD to EUR");
            return amount;
        }

        return amount * this.getCurEurRate();
    }

    private void setCurEurRate(double curEurRate) {
        this.curEurRate = curEurRate;
    }

    private double getCurEurRate() {
        return this.curEurRate;
    }
}
