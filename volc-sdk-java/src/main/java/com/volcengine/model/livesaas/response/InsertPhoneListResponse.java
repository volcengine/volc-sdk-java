package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class InsertPhoneListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    InsertPhoneListResponseBody result;

    @Data
    public static class InsertPhoneListResponseBody {
        @JSONField(name="ActivityId")
        Long ActivityId;
        @JSONField(name="ErrorPhoneList")
        List<ErrorPhoneList> ErrorPhoneList;
    }

    @Data
    public static class ErrorPhoneList {
        @JSONField(name="ErrorPhone")
        String ErrorPhone;
        @JSONField(name="ErrorReason")
        String ErrorReason;
    }
}
