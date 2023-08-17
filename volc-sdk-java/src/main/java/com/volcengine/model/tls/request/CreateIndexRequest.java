package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.KeyValueInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateIndexRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = FULL_TEXT)
    FullTextInfo fullTextInfo;
    @JSONField(name = KEY_VALUE)
    List<KeyValueInfo> keyValue;

    /**
     * @param topicId      日志主题 ID
     * @param fullTextInfo 全文索引配置
     * @param keyValue     键值索引配置
     */
    public CreateIndexRequest(String topicId, FullTextInfo fullTextInfo, List<KeyValueInfo> keyValue) {
        this.topicId = topicId;
        this.fullTextInfo = fullTextInfo;
        this.keyValue = keyValue;
    }

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 全文索引配置
     */
    public FullTextInfo getFullTextInfo() {
        return fullTextInfo;
    }

    /**
     * @param fullTextInfo 全文索引配置
     */
    public void setFullTextInfo(FullTextInfo fullTextInfo) {
        this.fullTextInfo = fullTextInfo;
    }

    /**
     * @return 键值索引配置
     */
    public List<KeyValueInfo> getKeyValue() {
        return keyValue;
    }

    /**
     * @param keyValue 键值索引配置
     */
    public void setKeyValue(List<KeyValueInfo> keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
