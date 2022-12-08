package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetPageWatchDataAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetPageWatchDataAPIResponseBody result;

    @Data
    public static class GetPageWatchDataAPIResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "PageClicks")
        PageClicksForm PageClicks;
    }

    @Data
    public static class PageClicksForm {
        @JSONField(name = "PV")
        Long PV;
        @JSONField(name = "UV")
        Long UV;
        @JSONField(name = "TotalTime")
        Long TotalTime;
        @JSONField(name = "AvgTime")
        Double AvgTime;
        @JSONField(name = "AvgNumber")
        Double AvgNumber;
        @JSONField(name = "Pcu")
        Long Pcu;
    }
}