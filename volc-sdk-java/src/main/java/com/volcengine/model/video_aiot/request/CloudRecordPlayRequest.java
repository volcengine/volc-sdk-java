package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CloudRecordPlayRequest {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTs")
    int startTs;
    @JSONField(name = "EndTs")
    int endTs;
    @JSONField(name = "TokenValid")
    int tokenValid;

}
