package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class SearchLogsRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = QUERY)
    String query;
    @JSONField(name = START_TIME)
    BigInteger startTime;
    @JSONField(name = END_TIME)
    BigInteger endTime;
    @JSONField(name = LIMIT)
    Integer limit = 20;
    @JSONField(name = CONTEXT)
    String context;
    @JSONField(name = SORT)
    String sort;

}
