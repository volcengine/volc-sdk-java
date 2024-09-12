package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.SmsTemplateInfo;
import lombok.Data;

import java.util.List;

@Data
public class GetSmsTemplateAndOrderListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;
    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<SmsTemplateInfo> list;
        @JSONField(name = "total")
        int total;
    }

}
