package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAlertRecordsResResultAlertRecordsItemAlertCond
 */
@lombok.Data
public final class GetImageAlertRecordsResResultAlertRecordsItemAlertCond  {

    /**
     * <p>规则之间的逻辑关系，取值如下所示：</p>
     *
     *
     *
     * <p>- `and`：和</p>
     *
     * <p>- `or`：或</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogicOp")
    private String logicOp;

    /**
     * <p>各指标告警信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlertContent")
    private GetImageAlertRecordsResResultAlertRecordsItemAlertCondAlertContent alertContent;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
