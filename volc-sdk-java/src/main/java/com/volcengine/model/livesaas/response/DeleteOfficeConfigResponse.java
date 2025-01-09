package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Office;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class DeleteOfficeConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteOfficeConfigResponseBody result;

    @Data
    public static class DeleteOfficeConfigResponseBody {
        @JSONField(name = "OfficeId")
        String OfficeId;
    }
}
