package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetRecordV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    RecordRespV2 result;

    @Data
    public static class RecordRespV2 {
        @JSONField(name = "Num")
        private int num;
        @JSONField(name = "Items")
        private List<RecordItemV2> itemList;
    }

    @Data
    public static class RecordItemV2{
        @JSONField(name = "ChannelID")
        private String ChannelID;
        @JSONField(name = "StartTime")
        private String startTime;
        @JSONField(name = "EndTime")
        private String endTime;
        @JSONField(name = "StartTimeStamp")
        private int startTimestamp;
        @JSONField(name = "EndTimeStamp")
        private int endTimestamp;
        @JSONField(name = "Secrecy")
        private String secrecy;
        @JSONField(name = "Type")
        private String type;
        @JSONField(name = "FileSize")
        private int fileSize;
    }
}
