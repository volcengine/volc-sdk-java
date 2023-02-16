package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


@Data
public class GetPageWatchDataAPIV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetPageWatchDataAPIV2ResponseBody result;

    @Data
    public static class GetPageWatchDataAPIV2ResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "PageClicks")
        PageClicksFormAPI PageClicks;
    }

    @Data
    public static class PageClicksFormAPI {
        @JSONField(name = "TotalTime")
        Long TotalTime;
        @JSONField(name = "AvgTime")
        Double AvgTime;
        @JSONField(name = "AvgNumber")
        Double AvgNumber;
        @JSONField(name = "PCU")
        Long PCU;
        @JSONField(name = "PV")
        Long PV;
        @JSONField(name = "UV")
        Long UV;
    }
}