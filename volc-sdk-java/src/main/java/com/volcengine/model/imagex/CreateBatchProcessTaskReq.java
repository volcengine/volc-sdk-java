package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateBatchProcessTaskReq {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "BatchingInfo")
    List<CreateBatchProcessTaskReqBatchingInfo> batchingInfo;

    @JSONField(name = "Callback")
    String callback;

    @JSONField(name = "CallbackBody")
    String callbackBody;

    @JSONField(name = "CallbackBodyType")
    String callbackBodyType;
}