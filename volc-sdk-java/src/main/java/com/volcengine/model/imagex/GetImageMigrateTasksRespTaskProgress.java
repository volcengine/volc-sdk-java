package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksRespTaskProgress {
    @JSONField(name = "SuccessCnt")
    Integer successCnt;

    @JSONField(name = "FailCnt")
    Integer failCnt;

    @JSONField(name = "TotalCnt")
    Integer totalCnt;

    @JSONField(name = "SuccessAmount")
    Integer successAmount;

    @JSONField(name = "TotalAmount")
    Integer totalAmount;

    @JSONField(name = "ErrCode")
    Integer ErrCode;

    @JSONField(name = "ErrMsg")
    String errMsg;
}

