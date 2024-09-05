package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class InsertWhiteListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name="Result")
    InsertWhiteListResponseBody result;

    @Data
    public static class InsertWhiteListResponseBody {
        @JSONField(name="ActivityId")
        Long ActivityId;
        @JSONField(name="ErrorUserList")
        List<ErrorUserList> ErrorUserList;
    }

    @Data
    public static class ErrorUserList {
        @JSONField(name="ExternalUserId")
        String ExternalUserId;
        @JSONField(name="NickName")
        String NickName;
        @JSONField(name="ErrorReason")
        String ErrorReason;
    }

}
