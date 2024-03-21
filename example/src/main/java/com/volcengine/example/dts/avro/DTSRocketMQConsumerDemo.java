package org.example;

import org.apache.rocketmq.acl.common.AclClientRPCHook;
import org.apache.rocketmq.acl.common.SessionCredentials;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.consumer.rebalance.AllocateMessageQueueAveragely;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.RPCHook;
import org.example.avro.Record;

import java.util.List;



public class DTSRocketMQConsumerDemo {
    private final String NAMESERVER_ADDER;
    private  final String TOPIC;
    private  final String GROUP;
    private  final String ACL_ACCESS_KEY;
    private  final String ACL_SECRET_KEY;
    private final AvroDeserializer deserializer;

    public DTSRocketMQConsumerDemo(String nameserver,String topic, String group, String accesskey,String secretkey){
        NAMESERVER_ADDER = nameserver;
        TOPIC = topic;
        GROUP = group;
        ACL_ACCESS_KEY = accesskey;
        ACL_SECRET_KEY = secretkey;
        deserializer = new AvroDeserializer();
    }

    public void consume()throws java.lang.Exception {
        System.out.printf("[CONFIG] namesrvAddr: %s, topic: %s, group: %s, accessKey: %s, secret: %s\n",
                NAMESERVER_ADDER, TOPIC, GROUP, ACL_ACCESS_KEY, ACL_SECRET_KEY);
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(GROUP, getAclRPCHook(), new AllocateMessageQueueAveragely());
        consumer.setNamesrvAddr(NAMESERVER_ADDER);
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.subscribe(TOPIC, "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
                for (MessageExt msg : msgs) {
                    Record record = deserializer.deserialize(msg.getBody());
                    AvroRecordPrinter.printRecord(record);
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.out.println("Consumer Started.");
    }

    private RPCHook getAclRPCHook() {
        return new AclClientRPCHook(new SessionCredentials(ACL_ACCESS_KEY, ACL_SECRET_KEY));
    }

    public static void main(String[] args) {
        // set your rocketmq nameserver
        String nameserver = "your nameserver address";
        // set your rocketmq access key and secret key
        String accesskey = "your access key";
        String secretkey = "your secret key";
        // set your rocketmq topic and group
        String topic = "your topic";
        String group = "your group";
        DTSRocketMQConsumerDemo c = new DTSRocketMQConsumerDemo(nameserver,topic,group, accesskey, secretkey);
        // start consume
        try {
            c.consume();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
    }
}
