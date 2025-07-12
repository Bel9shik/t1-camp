package t1.camp.kafka.core.factories;

import java.util.List;
import java.util.Random;

public class WeatherFactory {

    private static final Random random = new Random();

    // имитация городов
    private static final List<String> cities = List.of(
            "Магадан",
            "Чукотка",
            "Питер",
            "Москва",
            "Томск",
            "Краснодар",
            "Ростов-на-Дону",
            "Тюмень",
            "Новокузнецк",
            "Калининград",
            "Омск",
            "Киров"
    );

    private static final int maxTemp = 35;
    private static final int minTemp = 0;

    private static final List<String> weather = List.of(
            "Солнечно",
            "Облачно",
            "Дождь",
            "Снег"
    );

    public static String getRandomizerWeather() {
        StringBuilder builder = new StringBuilder();

        builder.append(cities.get(random.nextInt(cities.size()))).append(":");
        builder.append(weather.get(random.nextInt(weather.size()))).append(":");
        builder.append(random.nextInt(maxTemp)).append(".");

        return builder.toString();
    }

}
