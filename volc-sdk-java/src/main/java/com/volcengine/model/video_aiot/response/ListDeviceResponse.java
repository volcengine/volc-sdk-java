package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListDeviceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListDevice listDevice;

    @Data
    public static class ListDevice {
        @JSONField(name = "PageNumber")
        int pageNumber;
        @JSONField(name = "PageSize")
        int pageSize;
        @JSONField(name = "TotalCount")
        int totalCount;

        @JSONField(name = "Devices")
        List<Device> devices;
    }
}
