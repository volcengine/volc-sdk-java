package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.FROM;

@Data
public class DescribeCursorRequest {
    @JSONField(serialize = false)
    private String topicId;
    @JSONField(serialize = false)
    private Integer shardId;
    @JSONField(name = FROM)
    private String from;

    public DescribeCursorRequest() {
    }

    public DescribeCursorRequest(String topicId, Integer shardId, String from) {
        this.topicId = topicId;
        this.shardId = shardId;
        this.from = from;
    }

}
