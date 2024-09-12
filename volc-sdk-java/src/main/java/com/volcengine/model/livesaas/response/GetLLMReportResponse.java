package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.GetLLMReportData;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetLLMReportResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetLLMReportResponseBody result;

    @Data
    public static class GetLLMReportResponseBody {
        @JSONField(name = "Code")
        Integer Code;
        @JSONField(name = "Message")
        String Message;
        @JSONField(name = "Data")
        GetLLMReportData Data;
    }
}
