package com.volcengine.model.tls.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ConsumerGroup;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.CONSUMER_GROUPS;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeConsumerGroupsResponse extends CommonResponse {
    @JSONField(name = CONSUMER_GROUPS)
    List<ConsumerGroup> consumerGroups;

    public DescribeConsumerGroupsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeConsumerGroupsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeConsumerGroupsResponse response = (DescribeConsumerGroupsResponse) super.deSerialize(data, clazz);
        this.setConsumerGroups(response.getConsumerGroups());
        return this;
    }
}
