package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AppSceneMetaInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

/**
 * 单数版 DescribeAppSceneMeta 响应。直接是 DescribeAppSceneMetasRes 字段集合。
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAppSceneMetaResponse extends CommonResponse {
    @JSONField(name = DESCRIBE_CLUSTER_STORE_META)
    private AppSceneMetaInfo.DescribeClusterStoreMeta describeClusterStoreMeta;
    @JSONField(name = DESCRIBE_CLUSTER_META)
    private AppSceneMetaInfo.DescribeClusterMeta describeClusterMeta;
    @JSONField(name = DESCRIBE_SESSION_META)
    private AppSceneMetaInfo.DescribeSessionMeta describeSessionMeta;
    @JSONField(name = DESCRIBE_SESSION_MESSAGE)
    private List<AppSceneMetaInfo.DescribeSessionMessage> describeSessionMessage;
    @JSONField(name = DESCRIBE_SESSION_SUGGESTION)
    private String describeSessionSuggestion;
    @JSONField(name = DESCRIBE_KNOWLEDGE_BINDING)
    private AppSceneMetaInfo.DescribeKnowledgeBinding describeKnowledgeBinding;

    public DescribeAppSceneMetaResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAppSceneMetaResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAppSceneMetaResponse response = (DescribeAppSceneMetaResponse) super.deSerialize(data, clazz);
        this.setDescribeClusterStoreMeta(response.getDescribeClusterStoreMeta());
        this.setDescribeClusterMeta(response.getDescribeClusterMeta());
        this.setDescribeSessionMeta(response.getDescribeSessionMeta());
        this.setDescribeSessionMessage(response.getDescribeSessionMessage());
        this.setDescribeSessionSuggestion(response.getDescribeSessionSuggestion());
        this.setDescribeKnowledgeBinding(response.getDescribeKnowledgeBinding());
        return this;
    }
}
