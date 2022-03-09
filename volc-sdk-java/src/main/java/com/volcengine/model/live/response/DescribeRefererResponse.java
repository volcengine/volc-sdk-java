package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeRefererResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DescribeRefererResult result;


    @Data
    public static class DescribeRefererResult {

        @JSONField(name = "RefererList")
        RefererItem[] RefererList;
    }

    @Data
    public static class RefererItem {

        @JSONField(name = "Vhost")
        String vhost;
        @JSONField(name = "app")
        String app;
        @JSONField(name = "RefererInfoList")
        RefererInfo[] RefererInfoList;
    }

    @Data
    public static class RefererInfo {

        @JSONField(name = "Type")
        String Type;
        @JSONField(name = "Key")
        String Key;
        @JSONField(name = "Value")
        String Value;
        @JSONField(name = "Priority")
        Long Priority;

    }

}
