package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Office;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListOfficeConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListOfficeConfigResponseBody result;

    @Data
    public static class ListOfficeConfigResponseBody {
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "Offices")
        List<Office> Offices;
    }
}
