package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListStatisticsQuestionnaireRequest {
    @JSONField(name = "Source")
    Integer Source;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageItemCount")
    Integer PageItemCount;
}