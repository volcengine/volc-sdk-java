package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeHistogramV1Request {

    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = QUERY)
    String query;

    @JSONField(name = START_TIME)
    Long startTime;

    @JSONField(name = END_TIME)
    Long endTime;

    @JSONField(name = INTERVAL)
    Long interval;

    public boolean CheckValidation() {
        return this.topicId != null && this.query != null && this.startTime != null && this.endTime != null;
    }
}
