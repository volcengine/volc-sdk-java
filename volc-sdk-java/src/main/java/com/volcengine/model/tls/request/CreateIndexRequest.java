package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.KeyValueInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndexRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = FULL_TEXT)
    FullTextInfo fullTextInfo;
    @JSONField(name = KEY_VALUE)
    List<KeyValueInfo> keyValue;

    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
