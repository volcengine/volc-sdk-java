package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StreamLogsRequest {
    @JSONField(name = "StartTs")
    String startTs;
    @JSONField(name = "EndTs")
    String endTs;
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "order")
    String order;
    @JSONField(name = "PageNumber")
    int pageNumber;
    @JSONField(name = "PageSize")
    int pageSize;
}
