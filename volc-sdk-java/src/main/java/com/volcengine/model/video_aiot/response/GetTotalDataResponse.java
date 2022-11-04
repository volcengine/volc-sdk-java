package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
@Data
public class GetTotalDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTotalDataRes getTotalDataRes;

    @Data
    public static class GetTotalDataRes {
        @JSONField(name = "MaxUp")
        Float maxUp;
        @JSONField(name = "MaxDown")
        Float maxDown;
        @JSONField(name = "UpChainGrowth")
        String upChainGrowth;
        @JSONField(name = "DownChainGrowth")
        String downChainGrowth;
    }
}
