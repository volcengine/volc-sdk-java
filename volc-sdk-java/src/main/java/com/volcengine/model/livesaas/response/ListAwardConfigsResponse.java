package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardConfigStatistic;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;


@Data
public class ListAwardConfigsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAwardConfigsResponseBody result;

    @Data
    public static class ListAwardConfigsResponseBody {
        @JSONField(name = "AwardConfigs")
        List<AwardConfigStatistic> AwardConfigs;
    }
}
