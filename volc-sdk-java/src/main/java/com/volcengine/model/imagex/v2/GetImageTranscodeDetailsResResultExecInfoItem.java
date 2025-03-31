package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsResResultExecInfoItem
 */
@lombok.Data
public final class GetImageTranscodeDetailsResResultExecInfoItem  {

    /**
     * <p>条目 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    /**
     * <p>提交时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubmitAt")
    private String submitAt;

    /**
     * <p>开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartAt")
    private String startAt;

    /**
     * <p>结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndAt")
    private String endAt;

    /**
     * <p>执行状态。取值如下所示：</p>
     *
     *
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Running`：执行中</p>
     *
     * <p>- `Success`：执行成功</p>
     *
     * <p>- `Fail`：执行失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>执行输入</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExecInput")
    private GetImageTranscodeDetailsResResultExecInfoItemExecInput execInput;

    /**
     * <p>执行输出</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExecOutput")
    private GetImageTranscodeDetailsResResultExecInfoItemExecOutput execOutput;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
