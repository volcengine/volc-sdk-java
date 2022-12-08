package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetActivityAntidirtResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityAntidirtResponseBody result;

    @Data
    public static class GetActivityAntidirtResponseBody {
        @JSONField(name = "WordList")
        List<String> WordList;
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
        @JSONField(name = "EnablePhoneNumberFilter")
        Integer EnablePhoneNumberFilter;
    }
}