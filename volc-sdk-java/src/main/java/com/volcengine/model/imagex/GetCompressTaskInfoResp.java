package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetCompressTaskInfoResp {
    @JSONField(name = "Status")
    String status;

    @JSONField(name = "TaskId")
    String taskId;

    @JSONField(name = "ProcessCount")
    Integer processCount;

    @JSONField(name = "OutputUri")
    String outputUri;

    @JSONField(name = "ErrMsg")
    String errMsg;

    @JSONField(name = "ErrCode")
    Integer errCode;


}
