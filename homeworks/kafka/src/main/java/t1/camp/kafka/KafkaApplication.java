package t1.camp.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;
import t1.camp.kafka.core.factories.WeatherFactory;
import t1.camp.kafka.core.producers.WeatherProducer;

@SpringBootApplication
@EnableKafka
public class KafkaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(KafkaApplication.class, args);
        WeatherProducer weatherProducer = context.getBean(WeatherProducer.class);

        try {
            while (true) {
                weatherProducer.sendMessage(WeatherFactory.getRandomizerWeather(), "weather");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
