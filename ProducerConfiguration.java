import java.beans.BeanProperty;

public class ProducerConfiguration {
    public ProducerFactory<String, Message> producerFactory() {
        return new DefaultKafkaProducerFactory<>(ProducerConfigurations());
    }
}
