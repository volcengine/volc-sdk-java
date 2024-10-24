package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardConfigStatistic;
import com.volcengine.model.beans.livesaas.AwardItem;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;


@Data
public class GetAwardItemListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAwardItemListResponseBody result;

    @Data
    public static class GetAwardItemListResponseBody {
        @JSONField(name = "AwardItemList")
        List<AwardItem> AwardItemList;
        @JSONField(name = "TotalCount")
        Long TotalCount;
    }
}
