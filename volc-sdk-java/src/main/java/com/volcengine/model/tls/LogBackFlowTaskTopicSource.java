package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.PROJECT_ID;
import static com.volcengine.model.tls.Const.TOPIC_ID_UPPERCASE;

@Data
@NoArgsConstructor
public class LogBackFlowTaskTopicSource {
    @JSONField(name = PROJECT_ID)
    private String projectId;
    @JSONField(name = TOPIC_ID_UPPERCASE)
    private String topicId;
}
