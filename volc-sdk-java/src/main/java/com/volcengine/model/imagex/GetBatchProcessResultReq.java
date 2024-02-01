package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetBatchProcessResultReq {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "BatchingInfo")
    List<CreateBatchProcessTaskReqBatchingInfo> batchingInfo;
}
