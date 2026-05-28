package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

/**
 * AppSceneMeta 相关的请求/响应内嵌结构聚合文件。
 */
public class AppSceneMetaInfo {

    @Data
    @NoArgsConstructor
    public static class ClusterStoreMeta {
        @JSONField(name = CLUSTER_STORE_NAME)
        private String clusterStoreName;
        @JSONField(name = DESCRIPTION)
        private String description;
    }

    @Data
    @NoArgsConstructor
    public static class ClusterInfo {
        @JSONField(name = CLUSTER_ID)
        private String clusterId;
        @JSONField(name = CLUSTER_PATTERN)
        private String clusterPattern;
        @JSONField(name = TAGS)
        private Object tags;
    }

    @Data
    @NoArgsConstructor
    public static class FeedBackMeta {
        @JSONField(name = SESSION_ID)
        private String sessionId;
        @JSONField(name = MESSAGE_ID)
        private String messageId;
        @JSONField(name = FEED_BACK_TYPE)
        private String feedBackType;
        @JSONField(name = AI_ASSISTANT_FEATURE)
        private Integer aiAssistantFeature;
    }

    @Data
    @NoArgsConstructor
    public static class KnowledgeBindingMeta {
        @JSONField(name = KNOWLEDGE_RESOURCE_ID)
        private String knowledgeResourceId;
        @JSONField(name = KNOWLEDGE_NAME)
        private String knowledgeName;
        @JSONField(name = PROJECT_FIELD)
        private String project;
        @JSONField(name = ENDPOINT)
        private String endpoint;
    }

    @Data
    @NoArgsConstructor
    public static class MetaRecord {
        @JSONField(name = CLUSTER_STORE_META)
        private ClusterStoreMeta clusterStoreMeta;
        @JSONField(name = CLUSTERS_INFOS)
        private List<ClusterInfo> clustersInfos;
        @JSONField(name = FEED_BACK_META)
        private FeedBackMeta feedBackMeta;
        @JSONField(name = KNOWLEDGE_BINDING_META)
        private KnowledgeBindingMeta knowledgeBindingMeta;
    }

    @Data
    @NoArgsConstructor
    public static class DescribeClusterStoreMeta {
        @JSONField(name = CLUSTER_STORE_ID)
        private String clusterStoreId;
        @JSONField(name = CLUSTER_STORE_NAME)
        private String clusterStoreName;
        @JSONField(name = DESCRIPTION)
        private String description;
        @JSONField(name = CREATE_TIME)
        private String createTime;
        @JSONField(name = MATCH_JOB_NUMS)
        private long matchJobNums;
        @JSONField(name = TOPIC_NAME)
        private String topicName;
        @JSONField(name = TOPIC_ID)
        private String topicId;
        @JSONField(name = PROJECT_NAME)
        private String projectName;
        @JSONField(name = PROJECT_ID)
        private String projectId;
    }

    @Data
    @NoArgsConstructor
    public static class DescribeClusterMeta {
        @JSONField(name = CLUSTER_ID)
        private String clusterId;
        @JSONField(name = PATTERN)
        private String pattern;
        @JSONField(name = TAGS)
        private Object tags;
        @JSONField(name = SOURCE)
        private String source;
        @JSONField(name = JOB_NAME)
        private String jobName;
        @JSONField(name = JOB_ID)
        private String jobId;
    }

    @Data
    @NoArgsConstructor
    public static class DescribeSessionMeta {
        @JSONField(name = SESSION_ID)
        private String sessionId;
        @JSONField(name = TITLE)
        private String title;
        @JSONField(name = CREATE_TIME)
        private String createTime;
        @JSONField(name = UPDATE_TIME)
        private String updateTime;
    }

    @Data
    @NoArgsConstructor
    public static class DescribeKnowledgeBinding {
        @JSONField(name = BINDING_ID)
        private String bindingId;
        @JSONField(name = KNOWLEDGE_RESOURCE_ID)
        private String knowledgeResourceId;
        @JSONField(name = KNOWLEDGE_NAME)
        private String knowledgeName;
        @JSONField(name = PROJECT_FIELD)
        private String project;
        @JSONField(name = ENDPOINT)
        private String endpoint;
        @JSONField(name = CREATE_TIME)
        private String createTime;
        @JSONField(name = UPDATE_TIME)
        private String updateTime;
    }

    @Data
    @NoArgsConstructor
    public static class MultiMessagePart {
        @JSONField(name = TYPE)
        private Integer type;
        @JSONField(name = TEXT)
        private String text;
        @JSONField(name = SHORT_NAME)
        private String shortName;
        @JSONField(name = TEXT_URI)
        private String textURI;
    }

    @Data
    @NoArgsConstructor
    public static class DescribeSessionMessage {
        @JSONField(name = MESSAGE_ID)
        private String messageId;
        @JSONField(name = CREATED_TIME_STAMP)
        private String createdTimeStamp;
        @JSONField(name = SESSION_MESSAGE_TYPE)
        private String sessionMessageType;
        @JSONField(name = MSG_STATUS)
        private String msgStatus;
        @JSONField(name = MESSAGES)
        private List<String> messages;
        @JSONField(name = PASS_DETECT)
        private boolean passDetect;
        @JSONField(name = REASONING_CONTENT)
        private String reasoningContent;
        @JSONField(name = MULTI_CONTENT)
        private List<MultiMessagePart> multiContent;
        @JSONField(name = CONVERSATION_MESSAGE_TYPE)
        private String conversationMessageType;
    }

    @Data
    @NoArgsConstructor
    public static class DescribeAppSceneMetasRes {
        @JSONField(name = DESCRIBE_CLUSTER_STORE_META)
        private DescribeClusterStoreMeta describeClusterStoreMeta;
        @JSONField(name = DESCRIBE_CLUSTER_META)
        private DescribeClusterMeta describeClusterMeta;
        @JSONField(name = DESCRIBE_SESSION_META)
        private DescribeSessionMeta describeSessionMeta;
        @JSONField(name = DESCRIBE_SESSION_MESSAGE)
        private List<DescribeSessionMessage> describeSessionMessage;
        @JSONField(name = DESCRIBE_SESSION_SUGGESTION)
        private String describeSessionSuggestion;
        @JSONField(name = DESCRIBE_KNOWLEDGE_BINDING)
        private DescribeKnowledgeBinding describeKnowledgeBinding;
    }
}
