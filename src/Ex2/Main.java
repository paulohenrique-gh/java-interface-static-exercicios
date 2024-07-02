package Ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit");
        System.out.println("20ºC = " + TemperatureConverter.celsiusToFahrenheit(20) + "ºF");
        System.out.println("17ºC = " + TemperatureConverter.celsiusToFahrenheit(17) + "ºF");
        System.out.println("8ºC = " + TemperatureConverter.celsiusToFahrenheit(8) + "ºF");

        System.out.println("Fahrenheit to Celsius");
        System.out.println("67ºF = " + TemperatureConverter.fahrenheitToCelsius(67) + "ºC");
        System.out.println("40ºF = " + TemperatureConverter.fahrenheitToCelsius(40) + "ºC");
        System.out.println("71ºF = " + TemperatureConverter.fahrenheitToCelsius(71) + "ºC");
    }
}
