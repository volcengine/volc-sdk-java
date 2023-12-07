package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListStreamRecordsRequestV3 {
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTime")
    long startTime;
    @JSONField(name = "EndTime")
    long endTime;
    @JSONField(serialize = false)
    int pageNumber;
    @JSONField(serialize = false)
    int pageSize;
    @JSONField(name = "StreamingIndex")
    int streamingIndex;
    @JSONField(name = "Resolution")
    String resolution;
    @JSONField(name = "ReqType")
    String reqType;
    @JSONField(name = "WithSub")
    boolean withSub;
}
