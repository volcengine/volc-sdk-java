package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListDeviceRecordsRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "StreamID")
    String streamID;
    @JSONField(name = "StartTs")
    String startTs;
    @JSONField(name = "EndTs")
    String endTs;
    @JSONField(name = "PageNumber")
    int pageNumber;
    @JSONField(name = "PageSize")
    int pageSize;
}
