package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListVodPlayerConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListVodPlayerConfigResponseBody result;

    @Data
    public static class ListVodPlayerConfigResponseBody {
        @JSONField(name = "VodPlayerConfigs")
        List<ListVodPlayerConfigItem> VodPlayerConfigs;
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
    }

    @Data
    public static class ListVodPlayerConfigItem {
        @JSONField(name = "VodPlayerConfigId")
        String VodPlayerConfigId;
        @JSONField(name = "IsDefaultVodPlayerConfig")
        Integer IsDefaultVodPlayerConfig;
        @JSONField(name = "VodPlayerName")
        String VodPlayerName;
        @JSONField(name = "UpdateTime")
        Long UpdateTime;
    }
}