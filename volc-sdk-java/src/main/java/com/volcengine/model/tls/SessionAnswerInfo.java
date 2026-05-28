package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

/**
 * DescribeSessionAnswer 相关的请求/响应内嵌结构聚合文件。
 * SSE 流式响应字段未做协议解析，仅暴露 JSON 结构。
 */
public class SessionAnswerInfo {

    @Data
    @NoArgsConstructor
    public static class Attachment {
        @JSONField(name = CONTENT_TYPE)
        private Integer contentType;
        @JSONField(name = CONTENT)
        private String content;
        @JSONField(name = TEXT_URI)
        private String textURI;
    }

    @Data
    @NoArgsConstructor
    public static class AlarmReceiverInfo {
        @JSONField(name = RECEIVER_CHANNELS)
        private List<String> receiverChannels;
        @JSONField(name = ALARM_CONTENT_TEMPLATE_ID)
        private String alarmContentTemplateId;
        @JSONField(name = ALARM_CONTENT_TEMPLATE_NAME)
        private String alarmContentTemplateName;
    }

    @Data
    @NoArgsConstructor
    public static class AlarmNotifyGroupsInfo {
        @JSONField(name = ALARM_NOTIFY_GROUP_NAME)
        private String groupName;
        @JSONField(name = ALARM_NOTIFY_GROUP_ID)
        private String notifyGroupId;
        @JSONField(name = NOTIFY_TYPE)
        private List<String> notifyType;
        @JSONField(name = ALARM_RECEIVERS)
        private List<AlarmReceiverInfo> alarmReceivers;
    }

    @Data
    @NoArgsConstructor
    public static class AlarmContentProcess {
        @JSONField(name = RECEIVER_CHANNEL)
        private String receiverChannel;
        @JSONField(name = ALARM_CONTENT_PROCESS_TYPE)
        private Integer alarmContentProcessType;
        @JSONField(name = ALARM_ID_FIELD)
        private String alarmID;
        @JSONField(name = ALARM_NOTIFY_GROUPS_FIELD)
        private List<AlarmNotifyGroupsInfo> alarmNotifyGroups;
    }

    @Data
    @NoArgsConstructor
    public static class SessionResponseMessage {
        @JSONField(name = QUESTION_ID)
        private String questionId;
        @JSONField(name = SESSION_ID)
        private String sessionId;
        @JSONField(name = MESSAGE_ID)
        private String messageId;
        @JSONField(name = ANSWER)
        private String answer;
        @JSONField(name = PASS_DETECT)
        private boolean passDetect;
    }

    @Data
    @NoArgsConstructor
    public static class IntentInfo {
        @JSONField(name = NAME)
        private String name;
        @JSONField(name = REASON)
        private String reason;
        @JSONField(name = TYPE)
        private Integer type;
    }

    @Data
    @NoArgsConstructor
    public static class ToolCallInfo {
        @JSONField(name = NAME)
        private String name;
        @JSONField(name = INPUT_JSON)
        private String inputJson;
        @JSONField(name = OUTPUT)
        private String output;
        @JSONField(name = IS_FINISHED)
        private boolean isFinished;
        @JSONField(name = TOOL_CALL_ID)
        private String toolCallId;
    }

    @Data
    @NoArgsConstructor
    public static class RetrievalInfo {
        @JSONField(name = DOCUMENTS)
        private List<String> documents;
    }

    @Data
    @NoArgsConstructor
    public static class ModelAnswer {
        @JSONField(name = ANSWER)
        private String answer;
        @JSONField(name = PASS_DETECT)
        private boolean passDetect;
    }

    @Data
    @NoArgsConstructor
    public static class WorkFlowStage {
        @JSONField(name = NODE_NAME)
        private String nodeName;
        @JSONField(name = NODE_CONTENT)
        private String nodeContent;
    }
}
