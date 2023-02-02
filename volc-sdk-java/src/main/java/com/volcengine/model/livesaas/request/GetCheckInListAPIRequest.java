package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class GetCheckInListAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "PageNo")
    Integer PageNo;
    @JSONField(name = "PageCount")
    Integer PageCount;
}