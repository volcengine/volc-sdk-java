package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageContentBlockListReq {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "State")
    String state;
    @JSONField(name = "Order")
    String order;
    @JSONField(name = "StartTime")
    Long startTime;
    @JSONField(name = "EndTime")
    Long endTime;
    @JSONField(name = "Url")
    String url;
    @JSONField(name = "PageNum")
    Integer pageNum;
    @JSONField(name = "PageSize")
    Integer pageSize;

}
