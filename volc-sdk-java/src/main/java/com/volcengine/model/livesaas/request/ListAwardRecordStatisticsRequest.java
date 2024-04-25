package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class ListAwardRecordStatisticsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "AwardId")
    Long AwardId;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
    @JSONField(name = "SearchType")
    Byte SearchType;
}