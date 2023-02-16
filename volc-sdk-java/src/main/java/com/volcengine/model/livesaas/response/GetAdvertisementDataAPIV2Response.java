package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetAdvertisementDataAPIV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAdvertisementDataAPIV2ResponseBody result;

    @Data
    public static class GetAdvertisementDataAPIV2ResponseBody {
        @JSONField(name = "ShowThumbUpNumber")
        Long ShowThumbUpNumber;
        @JSONField(name = "ActualThumbUpNumber")
        Long ActualThumbUpNumber;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "AccountClicks")
        TotalViewsForm AccountClicks;
        @JSONField(name = "AdvertisingClicks")
        TotalViewsForm AdvertisingClicks;
        @JSONField(name = "AdInfo")
        List<AdvertisementStatistics> AdInfo;
    }

    @Data
    public static class TotalViewsForm {
        @JSONField(name = "PV")
        Long PV;
        @JSONField(name = "UV")
        Long UV;
        @JSONField(name = "TotalTime")
        Long TotalTime;
    }

    @Data
    public static class AdvertisementStatistics {
        @JSONField(name = "UV")
        Long UV;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "PageAdvertiseType")
        Integer PageAdvertiseType;
        @JSONField(name = "Content")
        String Content;
        @JSONField(name = "Link")
        String Link;
        @JSONField(name = "PV")
        Long PV;
    }
}