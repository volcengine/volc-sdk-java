package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.SmsSignatureInfo;
import lombok.Data;

import java.util.List;

@Data
public class GetSignatureAndOrderListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "List")
        List<SmsSignatureInfo> list;
        @JSONField(name = "Total")
        int total;
    }
}
