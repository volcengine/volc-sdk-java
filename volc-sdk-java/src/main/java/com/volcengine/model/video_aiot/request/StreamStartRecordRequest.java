package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StreamStartRecordRequest {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "AutoPull")
    boolean autoPull;
    @JSONField(name = "Timeout")
    int timeout;
    @JSONField(name = "RecordTime")
    int recordTime;
    @JSONField(name = "Remux")
    String remux;
    @JSONField(name = "Expire")
    int expire;
}
