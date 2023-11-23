package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class ListHostAcceleratePackOrderRequest {
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "Uid")
    String Uid;
    @JSONField(name = "Status")
    Integer Status;
    @JSONField(name = "StartTime")
    String StartTime;
    @JSONField(name = "EndTime")
    String EndTime;
    @JSONField(name = "Source")
    String Source;
}