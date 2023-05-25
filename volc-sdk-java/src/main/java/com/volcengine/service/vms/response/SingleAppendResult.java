package com.volcengine.service.vms.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SingleAppendResult {
    @JSONField(name = "SuccessList")
    private List<SingleResultItem> successList;

    @JSONField(name = "FailList")
    private List<SingleResultItem> failList;
}
