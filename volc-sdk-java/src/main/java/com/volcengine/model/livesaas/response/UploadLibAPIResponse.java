package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.VidResInfo;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UploadLibAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UploadLibAPIResultBean result;

    @Data
    public static class UploadLibAPIResultBean {
        @JSONField(name = "FailedList")
        List<VidResInfo> FailedList;

        @JSONField(name = "SuccessList")
        List<VidResInfo> SuccessList;
    }
}
