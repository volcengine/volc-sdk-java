package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListSiteTagAPIV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSiteTagAPIV2ResponseBody result;

    @Data
    public static class ListSiteTagAPIV2ResponseBody {
        @JSONField(name = "SiteTags")
        List<SimpleSiteTag> SiteTags;
        @JSONField(name = "TextSiteTags")
        List<SimpleTextSiteTag> TextSiteTags;
    }

    @Data
    public static class SimpleSiteTag {
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "Value")
        List<String> Value;
        @JSONField(name = "Show")
        Integer Show;
        @JSONField(name = "Index")
        Integer Index;
    }

    @Data
    public static class SimpleTextSiteTag {
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Name")
        String Name;
    }
}