package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateDownloadTaskRequest {
    @JSONField(name = TASK_NAME)
    String taskName;

    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = QUERY)
    String query;

    @JSONField(name = START_TIME)
    Long startTime;

    @JSONField(name = END_TIME)
    Long endTime;

    @JSONField(name = DATA_FORMAT)
    String dataFormat;

    @JSONField(name = SORT)
    String sort;

    @JSONField(name = LIMIT)
    Integer limit;

    @JSONField(name = COMPRESSION)
    String compression;

    public boolean CheckValidation() {
        if (this.topicId == null || this.query == null || this.startTime == null || this.endTime == null ||
            this.dataFormat == null || this.sort == null || this.limit == null || this.compression == null) {
            return false;
        }
        return true;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Deprecated
    public void setStartTime(BigInteger startTime) {
        this.startTime = startTime.longValue();
    }

    @Deprecated
    public void setEndTime(BigInteger endTime) {
        this.endTime = endTime.longValue();
    }
}
