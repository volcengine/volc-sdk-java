package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class VmsResult {
    @JSONField(name = "ApplyResult")
    List<GetApplyResult> getApplyResult;
}
