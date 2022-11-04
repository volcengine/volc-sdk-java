package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListDeviceRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "DeviceName")
    String deviceName;
    @JSONField(name = "PageNumber")
    int pageNumber;
    @JSONField(name = "PageSize")
    int pageSize;
}
