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
public class ModifyIndexRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;
    @JSONField(name = FULL_TEXT)
    private FullTextInfo fullTextInfo;
    @JSONField(name = KEY_VALUE)
    private List<KeyValueInfo> keyValue;
    @JSONField(name = USER_INNER_KEY_VALUE)
    private List<KeyValueInfo> userInnerKeyValue;
    @JSONField(name = MAX_TEXT_LEN)
    private Integer maxTextLen;
    @JSONField(name = ENABLE_AUTO_INDEX)
    private Boolean enableAutoIndex;

    /**
     * @param topicId      日志主题 ID
     * @param fullTextInfo 全文索引配置
     * @param keyValue     键值索引配置
     */
    public ModifyIndexRequest(String topicId, FullTextInfo fullTextInfo, List<KeyValueInfo> keyValue) {
        this.topicId = topicId;
        this.fullTextInfo = fullTextInfo;
        this.keyValue = keyValue;
    }

    /**
     * @param topicId           日志主题 ID
     * @param fullTextInfo      全文索引配置
     * @param keyValue          键值索引配置
     * @param userInnerKeyValue 预留字段索引配置
     * @param maxTextLen        统计字段值的最大长度
     * @param enableAutoIndex   是否开启索引自动更新
     */
    public ModifyIndexRequest(String topicId, FullTextInfo fullTextInfo, List<KeyValueInfo> keyValue, 
                              List<KeyValueInfo> userInnerKeyValue, Integer maxTextLen, Boolean enableAutoIndex) {
        this.topicId = topicId;
        this.fullTextInfo = fullTextInfo;
        this.keyValue = keyValue;
        this.userInnerKeyValue = userInnerKeyValue;
        this.maxTextLen = maxTextLen;
        this.enableAutoIndex = enableAutoIndex;
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
     * @return 预留字段索引配置
     */
    public List<KeyValueInfo> getUserInnerKeyValue() {
        return userInnerKeyValue;
    }

    /**
     * @param userInnerKeyValue 预留字段索引配置
     */
    public void setUserInnerKeyValue(List<KeyValueInfo> userInnerKeyValue) {
        this.userInnerKeyValue = userInnerKeyValue;
    }

    /**
     * @return 统计字段值的最大长度
     */
    public Integer getMaxTextLen() {
        return maxTextLen;
    }

    /**
     * @param maxTextLen 统计字段值的最大长度
     */
    public void setMaxTextLen(Integer maxTextLen) {
        this.maxTextLen = maxTextLen;
    }

    /**
     * @return 是否开启索引自动更新
     */
    public Boolean getEnableAutoIndex() {
        return enableAutoIndex;
    }

    /**
     * @param enableAutoIndex 是否开启索引自动更新
     */
    public void setEnableAutoIndex(Boolean enableAutoIndex) {
        this.enableAutoIndex = enableAutoIndex;
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
