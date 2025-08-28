package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ActivationRiskListBasePackagePartResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListBasePackagePartData result;

    @Data
    public static class ListBasePackagePartData {
        @JSONField(name = "PartIds")
        private List<Integer> partIds;
        @JSONField(name = "TotalNum")
        private Integer totalNum;
    }
}
