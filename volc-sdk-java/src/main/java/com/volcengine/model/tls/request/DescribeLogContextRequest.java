package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeLogContextRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = CONTEXT_FLOW)
    String contextFlow;

    @JSONField(name = PACKAGE_OFFSET)
    Integer packageOffset;

    @JSONField(name = SOURCE)
    String source;

    @JSONField(name = PREV_LOGS)
    Integer prevLogs;

    @JSONField(name = NEXT_LOGS)
    Integer nextLogs;
}
