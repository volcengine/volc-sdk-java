package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ActivationRiskListSampleDataPartResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSampleDataPartData result;

    @Data
    public static class ListSampleDataPartData {
        @JSONField(name = "PartIds")
        private List<Integer> partIds;
        @JSONField(name = "TotalNum")
        private Integer totalNum;
    }
}
