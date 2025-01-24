
    @Override
    public void reset() {
        System.out.println("Pressure Sensor reset");
    }
}


class Triple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }
}


interface Converter {
    double convertToEuro(double amount);
    double convertToUSD(double amount);
    double getConversionRate(String currency);
}

class CurrencyConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount * 0.85;  // Example rate
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 1.1;  // Example rate
    }

    @Override
    public double getConversionRate(String currency) {
        // Example implementation
        if (currency.equals("USD")) {
            return 1.1;
        } else if (currency.equals("EUR")) {
            return 0.85;
        }
        return 1.0;
    }
}

class UnitConverter implements Converter {
    @Override
    public double convertToEuro(double amount) {
        return amount / 100;  // Example conversion for units
    }

    @Override
    public double convertToUSD(double amount) {
        return amount / 90;  // Example conversion for units
    }

    @Override
    public double getConversionRate(String currency) {
        return 1.0;  // Example placeholder
    }
}


public class Utility {
    public static <T> boolean isEqualOrNull(T object1, T object2) {
        if (object1 == null && object2 == null) {
            return true;
        } else if (object1 == null || object2 == null) {
            return false;
        } else {
            return object1.equals(object2);
        }
    }
}
