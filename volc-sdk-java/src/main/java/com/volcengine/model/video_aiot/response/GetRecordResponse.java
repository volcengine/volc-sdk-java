package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetRecordResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RecordResp result;

    @Data
    public static class RecordResp {
        @JSONField(name = "Num")
        private int num;
        @JSONField(name = "Items")
        private List<RecordItem> itemList;
    }

    @Data
    public static class RecordItem {
        @JSONField(name = "DeviceID")
        private String deviceID;
        @JSONField(name = "StartTime")
        private String startTime;
        @JSONField(name = "EndTime")
        private String endTime;
        @JSONField(name = "Secrecy")
        private String secrecy;
        @JSONField(name = "Type")
        private String type;
        @JSONField(name = "FileSize")
        private int fileSize;
    }

}
