package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetVideoTrafficPayDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetVideoTrafficPayDataResponseBody result;

    @Data
    public static class GetVideoTrafficPayDataResponseBody {
        @JSONField(name = "PostPayVideoTrafficResult")
        List<VideoTrafficData> PostPayVideoTrafficResult;
        @JSONField(name = "PrePayVideoTrafficResult")
        List<VideoTrafficData> PrePayVideoTrafficResult;
    }

    @Data
    public static class VideoTrafficData {
        @JSONField(name = "Vid")
        String Vid;
        @JSONField(name = "Creator")
        ActivityCreatorForm Creator;
        @JSONField(name = "VodTraffic")
        Double VodTraffic;
    }
}