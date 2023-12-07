package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.junit.Test;

@Data
public class ListDeviceRecordsRequest {
    @JSONField(serialize = false)
    String spaceID;
    @JSONField(serialize = false)
    String streamID;
    @JSONField(name = "StartTs")
    String startTs;
    @JSONField(name = "EndTs")
    String endTs;
    @JSONField(serialize = false)
    int pageNumber;
    @JSONField(serialize = false)
    int pageSize;
    @JSONField(serialize = false)
    String deviceNSID;
    @JSONField(serialize = false)
    String channelID;
    @JSONField(serialize = false)
    int streamingIndex;
    @JSONField(serialize = false)
    String resolution;
    @JSONField(serialize = false)
    String reqType;
    @JSONField(serialize = false)
    boolean withSub;
}
