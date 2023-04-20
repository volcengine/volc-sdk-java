package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class SearchLogsRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = QUERY)
    String query;
    @JSONField(name = START_TIME)
    Long startTime;
    @JSONField(name = END_TIME)
    Long endTime;
    @JSONField(name = LIMIT)
    Integer limit = 20;
    @JSONField(name = CONTEXT)
    String context;
    @JSONField(name = SORT)
    String sort;

    public boolean CheckValidation() {
        if (this.topicId == null || this.query == null || this.startTime == null || this.endTime == null) {
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
