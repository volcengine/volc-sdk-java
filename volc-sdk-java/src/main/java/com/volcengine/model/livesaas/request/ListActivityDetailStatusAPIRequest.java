package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityDetailStatusAPIRequest {
    @JSONField(name = "ActivityIdList")
    List<Long> activityIds;
    @JSONField(name = "MobileNo")
    Long mobileNo;
}
