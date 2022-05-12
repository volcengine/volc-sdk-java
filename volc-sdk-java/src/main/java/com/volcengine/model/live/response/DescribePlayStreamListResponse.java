package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DescribePlayStreamListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    DescribePlayStreamListOutput Result;

    @Data
    public static class DescribePlayStreamListOutput {
        @JSONField(name = "PlayStreamList")
        private List<StreamInfoList> PlayStreamList;
        @JSONField(name = "RoughCount")
        private  int RoughCount;
        @JSONField(name = "Vhost")
        private String Vhost;
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "StartTime")
        private String StartTime;
        @JSONField(name = "EndTime")
        private String EndTime;
    }

    @Data
    public static class StreamInfoList {

        @JSONField(name = "App")
        private String App;
        @JSONField(name = "Domain")
        private String Domain;
        @JSONField(name = "EndTime")
        private String EndTime;
        @JSONField(name = "StartTime")
        private String StartTime;
        @JSONField(name = "Stream")
        private String Stream;
        @JSONField(name = "Vhost")
        private String Vhost;
    }
}
