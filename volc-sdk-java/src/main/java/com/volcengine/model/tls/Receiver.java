package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
public class Receiver {
    @JSONField(name = RECEIVER_TYPE)
    String receiverType;
    @JSONField(name = RECEIVER_NAMES)
    List<String> receiverNames;
    @JSONField(name = RECEIVER_CHANNELS)
    List<String> receiverChannels;
    @JSONField(name = START_TIME)
    String startTime;
    @JSONField(name = END_TIME)
    String endTime;
    @JSONField(name = WEBHOOK)
    String webhook;

    public Receiver() {
    }

    /**
     * @return 接受者类型
     */
    public String getReceiverType() {
        return receiverType;
    }

    /**
     * @param receiverType 接受者类型
     */
    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType;
    }

    /**
     * @return 接收者的名字
     */
    public List<String> getReceiverNames() {
        return receiverNames;
    }

    /**
     * @param receiverNames 接收者的名字
     */
    public void setReceiverNames(List<String> receiverNames) {
        this.receiverNames = receiverNames;
    }

    /**
     * @return 通知接收渠道，支持Email、Sms、Phone
     */
    public List<String> getReceiverChannels() {
        return receiverChannels;
    }

    /**
     * @param receiverChannels 通知接收渠道，支持Email、Sms、Phone
     */
    public void setReceiverChannels(List<String> receiverChannels) {
        this.receiverChannels = receiverChannels;
    }

    /**
     * @return 可接收信息的时段中，开始的时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 可接收信息的时段中，开始的时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return 可接收信息的时段结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 可接收信息的时段结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return 飞书Webhook请求地址
     */
    public String getWebhook() {
        return webhook;
    }

    /**
     * @param webhook 飞书Webhook请求地址
     */
    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }
}
