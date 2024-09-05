package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetWhiteListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name="Result")
    GetWhiteListResponseBody result;

    @Data
    public static class GetWhiteListResponseBody {
        @JSONField(name="ActivityId")
        Long activityId;
        @JSONField(name="WhiteList")
        List<WhiteList> WhiteList;
    }

    @Data
    public static class WhiteList {
        @JSONField(name="ExternalUserId")
        String externalUserId;
        @JSONField(name="NickName")
        String nickName;
    }
}
