package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetWebPushLiveClientAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetWebPushLiveClientAPIBody result;

    @Data
    public static class GetWebPushLiveClientAPIBody {
        @JSONField(name = "Url")
        String Url;
        @JSONField(name="TmpUrl")
        String TmpUrl;
        @JSONField(name="ExpireTime")
        Long ExpireTime;
    }
}