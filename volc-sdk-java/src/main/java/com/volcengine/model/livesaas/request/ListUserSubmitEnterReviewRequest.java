package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListUserSubmitEnterReviewRequest {
    @JSONField(name = "ActivityID")
    Long ActivityID;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "ReviewStatus")
    Integer ReviewStatus;
    @JSONField(name = "Content")
    String Content;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageCount")
    Integer PageCount;
    @JSONField(name = "SortOrder")
    Integer SortOrder;
}