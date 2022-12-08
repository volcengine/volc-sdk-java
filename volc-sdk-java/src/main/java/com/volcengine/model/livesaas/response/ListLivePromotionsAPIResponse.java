package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListLivePromotionsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListLivePromotionsAPIResponseBody result;

    @Data
    public static class ListLivePromotionsAPIResponseBody {
        @JSONField(name = "LivePromotionsInfos")
        List<LivePromotionsInfo> LivePromotionsInfos;
    }

    @Data
    public static class LivePromotionsInfo {
        @JSONField(name = "PushUrl")
        String PushUrl;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Name")
        String Name;
    }
}