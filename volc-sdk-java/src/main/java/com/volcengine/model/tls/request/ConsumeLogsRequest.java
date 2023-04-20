package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ConsumeLogsRequest {
    @JSONField(name = CURSOR)
    String cursor;
    @JSONField(name = END_CURSOR)
    String endCursor;
    @JSONField(name = LOG_GROUP_COUNT)
    Integer logGroupCount;
    @JSONField(name = COMPRESSION)
    String compression;
    @JSONField(serialize = false)
    String topicId;
    @JSONField(serialize = false)
    Integer shardId;

    public boolean CheckValidation() {
        if (this.topicId == null || this.shardId == null || this.cursor == null) {
            return false;
        }
        return true;
    }
}
