package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribePlayResponseStatusStatResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribePlayResponseStatusStatOutput Result;

    @Data
    public static class DescribePlayResponseStatusStatOutput {
        @JSONField(name = "Summary")
        private Summary Summary;
        @JSONField(name = "StatusStatList")
        private List<StatusStat> StatusStatList;
    }

    @Data
    public static class Summary {
        @JSONField(name = "TotalStatusStatList")
        private List<StatusStatData> TotalStatusStatList;
    }

    @Data
    public static class StatusStatData {
        @JSONField(name = "StatusCode")
        private int StatusCode;
        @JSONField(name = "Count")
        private int Count;
        @JSONField(name = "Percent")
        private double Percent;
    }


    @Data
    private static class StatusStat {
        @JSONField(name = "Time")
        private String Time;
        @JSONField(name = "StatusDataList")
        private List<StatusStatData> StatusDataList;
    }
}
