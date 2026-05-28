package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.LOG_BACK_FLOW_TASK_TOPIC_SOURCE;
import static com.volcengine.model.tls.Const.SOURCE_TYPE;

@Data
@NoArgsConstructor
public class LogBackFlowTaskSource {
    @JSONField(name = SOURCE_TYPE)
    private String sourceType;
    @JSONField(name = LOG_BACK_FLOW_TASK_TOPIC_SOURCE)
    private LogBackFlowTaskTopicSource logBackFlowTaskTopicSource;
}
