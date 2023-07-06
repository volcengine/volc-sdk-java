package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CloudRecordPlayRequest {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTs")
    Object startTs;
    @JSONField(name = "EndTs")
    Object endTs;
    @JSONField(name = "TokenValid")
    int tokenValid;

    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "ChannelID")
    String channelID;
    @JSONField(name = "StreamingIndex")
    int streamingIndex;
    @JSONField(name = "Resolution")
    String resolution;
}
