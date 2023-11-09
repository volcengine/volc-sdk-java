package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class VmsResult {
    @JSONField(name = "ApplyResult")
    List<GetApplyResult> getApplyResult;
    @JSONField(name = "approveTime")
    Long approveTime;
    @JSONField(name = "expireTime")
    Long expireTime;
    @JSONField(name = "restValidDays")
    Integer restValidDays;
    @JSONField(name = "status")
    Integer status;
}
