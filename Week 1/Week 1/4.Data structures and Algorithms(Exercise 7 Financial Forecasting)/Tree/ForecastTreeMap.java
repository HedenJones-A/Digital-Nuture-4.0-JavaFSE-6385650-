import java.util.*;

public class ForecastTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Double> forecast = new TreeMap<>();
        forecast.put(2023, 250000.0);
        forecast.put(2025, 100000.0);
        forecast.put(2024, 270000.0);
        forecast.put(2026, 110000.0);

        System.out.println("Sorted Financial Forecast:");
        for (Map.Entry<Integer, Double> entry : forecast.entrySet()) {
            System.out.println(entry.getKey() + " → ₹" + entry.getValue());
        }
    }
}
