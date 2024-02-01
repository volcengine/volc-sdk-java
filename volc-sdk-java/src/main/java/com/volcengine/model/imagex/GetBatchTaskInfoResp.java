package com.volcengine.model.imagex;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetBatchTaskInfoResp {
    @JSONField(name = "Data")
    List<GetBatchTaskInfoRespBatchResult> data;

    @JSONField(name = "TaskId")
    String taskId;

    @JSONField(name = "Callback")
    String callback;

    @JSONField(name = "CallbackBody")
    String callbackBody;

    @JSONField(name = "CallbackBodyType")
    String callbackBodyType;

    @JSONField(name = "Status")
    String status;

    @JSONField(name = "Err")
    String err;

    @JSONField(name = "Code")
    Integer code;
}
