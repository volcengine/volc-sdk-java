package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.InPageAdvertisement;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetInPageAdvertisementResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetInPageAdvertisementResponseBody result;

    @Data
    public static class GetInPageAdvertisementResponseBody {
        @JSONField(name = "IsEnable")
        private Integer IsEnable;
        @JSONField(name = "EnableFloating")
        private Boolean EnableFloating;
        @JSONField(name = "Advertisements")
        private List<InPageAdvertisement> Advertisements;
    }
}
