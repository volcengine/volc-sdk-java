package dts.sub.volc;

import com.github.daniel.shuy.kafka.protobuf.serde.KafkaProtobufDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class DTSKafkaConsumerDemo {
    private final String topic;
    private final Properties props;

    public DTSKafkaConsumerDemo(String brokers, String topic, String group, String username, String password) {
        this.topic = topic;
        // 配置 sasl 认证
        String jaasTemplate = "org.apache.kafka.common.security.scram.ScramLoginModule required username=\"%s\" password=\"%s\";";
        String jaasCfg = String.format(jaasTemplate, username, password);
        // 配置 kafka 参数
        props = new Properties();
        props.put("bootstrap.servers", brokers);
        props.put("group.id", group);
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("auto.offset.reset", "latest");
        props.put("session.timeout.ms", "30000");
        props.put("security.protocol", "SASL_PLAINTEXT");
        props.put("sasl.mechanism", "PLAIN");
        props.put("sasl.jaas.config", jaasCfg);
    }

    public void consume() throws java.lang.Exception {
        // init kafka consumer
        KafkaConsumer<String, Volc.Entry> consumer =
                new KafkaConsumer<String, Volc.Entry>(props,new StringDeserializer(),new KafkaProtobufDeserializer<>(Volc.Entry.parser()));
        // subscribe topic
        consumer.subscribe(Arrays.asList(topic));
        // Loop consuming messages
        while (true) {
            ConsumerRecords<String, Volc.Entry> records = consumer.poll(Duration.ofSeconds(1));
            for (ConsumerRecord<String, Volc.Entry> record : records) {
                // simply printed here
                System.out.println(record);
            }
        }
    }

    public static void main(String[] args)throws java.lang.Exception  {
        // set your kafka brokers address
        String brokers = "your brokers address";
        // set your kafka username and password
        String username = "yout username";
        String password = "your password";
        // set your kafka topic 和 group
        String topic = "your topic";
        String group = "your group";
        DTSKafkaConsumerDemo c = new DTSKafkaConsumerDemo(brokers,topic,group, username, password);
        // start consume
        c.consume();
    }
}