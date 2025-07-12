package t1.camp.kafka.core.producers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class WeatherProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage (String message, String topicName) {
        log.info("Send message: {}", message);

        kafkaTemplate.send(topicName, message);
    }

}
