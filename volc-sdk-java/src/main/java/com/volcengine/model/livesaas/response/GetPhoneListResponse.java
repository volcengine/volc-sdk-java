package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetPhoneListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetPhoneListResponseBody result;

    @Data
    public static class GetPhoneListResponseBody {
        @JSONField(name="ActivityId")
        Long ActivityId;
        @JSONField(name="PhoneList")
        List<String> PhoneList;
    }

}
