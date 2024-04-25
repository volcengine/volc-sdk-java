package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AwardRecordStatistic;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;


@Data
public class ListAwardRecordStatisticsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAwardRecordStatisticsResponseBody result;

    @Data
    public static class ListAwardRecordStatisticsResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "PageTotalCount")
        Integer PageTotalCount;
        @JSONField(name = "AwardRecords")
        List<AwardRecordStatistic> AwardRecords;
    }
}
