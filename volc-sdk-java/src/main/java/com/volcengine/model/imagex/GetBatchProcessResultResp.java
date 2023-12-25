package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetBatchProcessResultResp {
    @JSONField(name = "Data")
    List<GetBatchTaskInfoRespBatchResult> data;
}
