package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetAdvertisementDataAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAdvertisementDataAPIResultBean result;

    @Data
    public static class GetAdvertisementDataAPIResultBean {
        @JSONField(name = "ActivityId")
        Long activityId;
        @JSONField(name = "AccountClicks")
        ClicksData accountClicks;
        @JSONField(name = "AdvertisingClicks")
        ClicksData advertisingClicks;
        @JSONField(name = "AdInfo")
        AdInfo adInfo;
    }

    @Data
    public static class ClicksData {
        @JSONField(name = "PV")
        Long pv;
        @JSONField(name = "UV")
        Long uv;
    }

    @Data
    public static class AdInfo {
        @JSONField(name = "AdType")
        Integer adType;
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Link")
        String link;
        @JSONField(name = "PV")
        Long pv;
        @JSONField(name = "UV")
        Long uv;
    }
}
