package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ActivityCreatorForm;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetMediaStoragePayDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetMediaStoragePayDataResponseBody result;

    @Data
    public static class GetMediaStoragePayDataResponseBody {
        @JSONField(name = "TotalCapacity")
        Double TotalCapacity;
        @JSONField(name = "RemainCapacity")
        Double RemainCapacity;
        @JSONField(name = "AllUsedVidCapacity")
        Double AllUsedVidCapacity;
        @JSONField(name = "AllUsedDocCapacity")
        Double AllUsedDocCapacity;
        @JSONField(name = "AccountUsedVidCapacity")
        Double AccountUsedVidCapacity;
        @JSONField(name = "AccountUsedDocCapacity")
        Double AccountUsedDocCapacity;
        @JSONField(name = "PostPayMediaCapacityResult")
        Double PostPayMediaCapacityResult;
        @JSONField(name = "PrePayMediaCapacityResult")
        Double PrePayMediaCapacityResult;
    }
}