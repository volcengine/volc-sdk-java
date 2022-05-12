package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribeLiveTimeShiftDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribeLiveTimeShiftDataOutput Result;

    @Data
    public static class DescribeLiveTimeShiftDataOutput {
        @JSONField(name = "Vhosts")
        private List<String> Vhosts;

        @JSONField(name = "StartTime")
        private String StartTime;

        @JSONField(name = "EndTime")
        private String EndTime;

        @JSONField(name = "TimeShiftDataList")
        private List<TimeShiftDataList> TimeShiftDataList;
    }

    @Data
    public static class TimeShiftDataList {
        @JSONField(name = "TimeStamp")
        private String TimeStamp;

        @JSONField(name = "Storage")
        private long Storage;
    }
}
