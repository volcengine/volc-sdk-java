package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class ListChannelAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListChannelAPIResponseBody result;

    @Data
    public static class ListChannelAPIResponseBody {
        @JSONField(name = "TotalItemCount")
        Long TotalItemCount;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "Channels")
        List<ChannelAPI> Channels;
    }

    @Data
    public static class ChannelAPI {
        @JSONField(name = "ChannelName")
        String ChannelName;
        @JSONField(name = "ChannelTag")
        String ChannelTag;
        @JSONField(name = "CreateTime")
        Long CreateTime;
        @JSONField(name = "PV")
        Long PV;
    }
}