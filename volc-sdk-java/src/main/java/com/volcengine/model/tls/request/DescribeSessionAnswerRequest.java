package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.SessionAnswerInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeSessionAnswerRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = TOPIC_ID)
    private String topicId;
    @JSONField(name = SESSION_ID)
    private String sessionId;
    @JSONField(name = QUESTION)
    private String question;
    @JSONField(name = QUESTION_ID)
    private String questionId;
    @JSONField(name = INTENT)
    private Integer intent;
    @JSONField(name = ENABLE_DEEP_REASONING)
    private boolean enableDeepReasoning;
    @JSONField(name = ATTACHMENTS)
    private List<SessionAnswerInfo.Attachment> attachments;
    @JSONField(name = ALARM_CONTENT_PROCESS)
    private SessionAnswerInfo.AlarmContentProcess alarmContentProcess;
    @JSONField(serialize = false)
    private String accept = "text/event-stream";

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public boolean CheckValidation() {
        if (instanceId == null || instanceId.isEmpty()) {
            return false;
        }
        if (sessionId == null || sessionId.isEmpty()) {
            return false;
        }
        if (question == null || question.isEmpty()) {
            return false;
        }
        return true;
    }
}
