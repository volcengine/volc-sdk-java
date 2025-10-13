package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LiveLinkDurationData;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetLiveLinkDurationDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetLiveLinkDurationDataResponseBody result;

    @Data
    public static class GetLiveLinkDurationDataResponseBody {
        @JSONField(name = "PrePayData")
        private List<LiveLinkDurationData> PrePayData;

        @JSONField(name = "PostPayData")
        private List<LiveLinkDurationData> PostPayData;
    }
}