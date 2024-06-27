package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityPartnerRebroadcastResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityPartnerRebroadcastResponseBody result;

    @Data
    public static class GetActivityPartnerRebroadcastResponseBody {
        @JSONField(name = "RebroadcastActivities")
        List<RebroadcastActivity> RebroadcastActivities;
    }

    @Data
    public static class RebroadcastActivity {
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "ViewPageUrl")
        String ViewPageUrl;
        @JSONField(name = "ActivityId")
        Long ActivityId;
    }
}