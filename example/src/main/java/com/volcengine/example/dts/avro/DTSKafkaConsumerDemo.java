package org.example;

import org.example.avro.Record;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;


public class DTSKafkaConsumerDemo {
    private final String topic;
    private final Properties props;
    private final AvroDeserializer deserializer;


    public DTSKafkaConsumerDemo(String brokers, String topic, String group, String username, String password) {
        this.topic = topic;
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
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.ByteArrayDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.ByteArrayDeserializer");

        deserializer = new AvroDeserializer();
    }

    public void consume() throws Exception {
        // 新建 kafka 消费者
        KafkaConsumer<byte[], byte[]> consumer = new KafkaConsumer<byte[], byte[]>(props);
        // 订阅topic
        consumer.subscribe(Arrays.asList(topic));

        // 循环消费消息
        while (true) {
            ConsumerRecords<byte[], byte[]> consumerRecords = consumer.poll(Duration.ofSeconds(1));
            for (ConsumerRecord<byte[], byte[]> consumerRecord : consumerRecords) {
                Record record = deserializer.deserialize(consumerRecord.value());
                AvroRecordPrinter.printRecord(record);
            }
        }
    }

    public static void main(String[] args)throws Exception  {
        // set your kafka brokers address
        String brokers = "your brokers address";
        // set your kafka username and password
        String username = "yout username";
        String password = "your password";
        // set your kafka topic 和 group
        String topic = "your topic";
        String group = "your group";
        DTSKafkaConsumerDemo c = new DTSKafkaConsumerDemo(brokers, topic, group, username, password);
        // start consume
        c.consume();
    }
}
