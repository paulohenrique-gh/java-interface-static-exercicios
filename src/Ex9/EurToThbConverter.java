package Ex9;

public class EurToThbConverter implements CurrencyConverter{
    private double curThbRate = 39.53;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!fromCurrency.equalsIgnoreCase("EUR") || !toCurrency.equalsIgnoreCase("THB")) {
            System.out.println("This converter only converts EUR to THB");
            return amount;
        }

        return amount * this.getCurThbRate();
    }

    public double getCurThbRate() {
        return this.curThbRate;
    }

    public void setCurThbRate(double curThbRate) {
        this.curThbRate = curThbRate;
    }
}
