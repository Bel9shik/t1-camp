package t1.camp.kafka.core.consumers;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WeatherConsumer {

    @KafkaListener(topics = "weather",
            groupId = "weather.1")
    void listener (String data) {
        log.info("Receive message: [{}]", data);
    }

}
