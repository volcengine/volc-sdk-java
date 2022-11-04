package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Data
public class ListForwardResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListForwardResponse.ForwardWrapper forwards;

    @Data
    public static class ForwardWrapper {
        @JSONField(name = "PageNumber")
        int pageNumber;
        @JSONField(name = "PageSize")
        int pageSize;
        @JSONField(name = "Total")
        int total;
        @JSONField(name = "Streams")
        List<Forward> forwards;
    }

    @Data
    public static class Forward {
        @JSONField(name = "StreamID")
        String streamID;
        @JSONField(name = "Src")
        String src;
        @JSONField(name = "Dst")
        String dst;
        @JSONField(name = "CreateTime")
        BigInteger createTime;
        @JSONField(name = "Status")
        int status;
    }

}
