package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageMigrateTasksRespTaskProgress {
    @JSONField(name = "SuccessCnt")
    Long successCnt;

    @JSONField(name = "FailCnt")
    Long failCnt;

    @JSONField(name = "TotalCnt")
    Long totalCnt;

    @JSONField(name = "SuccessAmount")
    Long successAmount;

    @JSONField(name = "TotalAmount")
    Long totalAmount;

    @JSONField(name = "ErrCode")
    Integer errCode;

    @JSONField(name = "ErrMsg")
    String errMsg;
}

