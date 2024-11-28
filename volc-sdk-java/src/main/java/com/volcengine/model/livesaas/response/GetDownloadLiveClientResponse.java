package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetDownloadLiveClientResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetDownloadLiveClientResponseBody result;

    @Data
    public static class GetDownloadLiveClientResponseBody {
        @JSONField(name = "Url")
        String Url;
        @JSONField(name = "TmpUrl")
        String TmpUrl;
        @JSONField(name = "ExpireTime")
        Long ExpireTime;
    }
}