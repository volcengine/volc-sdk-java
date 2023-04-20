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

    public ModifyIndexRequest(String topicId, FullTextInfo fullTextInfo, List<KeyValueInfo> keyValue) {
        this.topicId = topicId;
        this.fullTextInfo = fullTextInfo;
        this.keyValue = keyValue;
    }

    public String getTopicId() {
        return topicId;
    }

    public FullTextInfo getFullTextInfo() {
        return fullTextInfo;
    }

    public List<KeyValueInfo> getKeyValue() {
        return keyValue;
    }

    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
