package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.ALLOW_CONSUME;
import static com.volcengine.model.tls.Const.CONSUME_TOPIC;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeKafkaConsumerResponse extends CommonResponse {

    @JSONField(name = ALLOW_CONSUME)
    Boolean allowConsume;

    @JSONField(name = CONSUME_TOPIC)
    String consumeTopic;

    public DescribeKafkaConsumerResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeKafkaConsumerResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeKafkaConsumerResponse response = (DescribeKafkaConsumerResponse) super.deSerialize(data, clazz);
        this.setAllowConsume(response.getAllowConsume());
        this.setConsumeTopic(response.getConsumeTopic());
        return this;
    }
}
