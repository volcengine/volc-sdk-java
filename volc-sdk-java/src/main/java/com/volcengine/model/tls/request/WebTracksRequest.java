package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.LOGS;
import static com.volcengine.model.tls.Const.SOURCE;

@Data
@NoArgsConstructor
public class WebTracksRequest {
    @JSONField(serialize = false)
    String topicId;

    @JSONField(serialize = false)
    String projectId;

    @JSONField(serialize = false)
    String compressType;

    @JSONField(name = LOGS)
    List<Map<String, String>> logs;

    @JSONField(name = SOURCE)
    String source;

    public boolean CheckValidation() {
        if (this.topicId == null || this.projectId == null || this.logs == null) {
            return false;
        }
        return true;
    }
}
