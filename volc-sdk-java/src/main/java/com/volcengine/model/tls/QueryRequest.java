package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class QueryRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = QUERY)
    String query;
    @JSONField(name = NUMBER)
    int number;
    @JSONField(name = START_TIME_OFFSET)
    int startTimeOffset;
    @JSONField(name = END_TIME_OFFSET)
    int endTimeOffset;
}
