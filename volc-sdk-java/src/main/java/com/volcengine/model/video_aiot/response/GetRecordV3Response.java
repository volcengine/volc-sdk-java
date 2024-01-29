package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetRecordV3Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RecordRespV3 result;

    @Data
    public static class RecordRespV3 {
        @JSONField(name = "Num")
        private int num;
        @JSONField(name = "Items")
        private List<RecordItemV3> itemList;
    }

    @Data
    public static class RecordItemV3 {
        @JSONField(name = "Name")
        private String name;
        @JSONField(name = "ChannelID")
        private String ChannelID;
        @JSONField(name = "StartTime")
        private int startTime;
        @JSONField(name = "EndTime")
        private int endTime;
        @JSONField(name = "Secrecy")
        private String secrecy;
        @JSONField(name = "Type")
        private String type;
        @JSONField(name = "FileSize")
        private int fileSize;
    }
}
