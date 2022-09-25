package com.volcengine.model.tls.response;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.Header;
import com.volcengine.model.tls.TopicInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeTopicResponse extends CommonResponse {
    TopicInfo topicInfo;

    public DescribeTopicResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeTopicResponse deSerialize(byte[] data, Class clazz) throws LogException {
        TopicInfo topicInfo = JSONObject.parseObject(data, TopicInfo.class);
        this.setTopicInfo(topicInfo);
        return this;
    }
}
