package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDeviceChannelV2Request {
    @JSONField(name = "DeviceID")
    private String deviceID;
    @JSONField(name = "QueryMode")
    private String queryMode;

    public void setQueryMode(GetDeviceChannelV2Request.QueryMode mode) {
        queryMode = mode.value;
    }

    public enum QueryMode {
        BRIEF("brief"),
        DETAIL("detail"),
        ;

        private final String value;

        QueryMode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
