package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class CreateDeviceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeviceWithSpaceID device;

    @Data
    @EqualsAndHashCode(callSuper = false)
    public static class DeviceWithSpaceID extends Device {
        @JSONField(name = "DeviceID")
        String deviceID;
    }
}
