package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetBatchTaskInfoResResult
 */
@lombok.Data
public final class GetBatchTaskInfoResResult  {

    /**
     * <p>异步批处理任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<GetBatchTaskInfoResResultDataItem> data;

    /**
     * <p>传入的回调地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>传入的回调内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBody")
    private String callbackBody;

    /**
     * <p>传入的回调内容格式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBodyType")
    private String callbackBodyType;

    /**
     * <p>任务状态，取值如下所示：</p>
     *
     * <p>- `Running`：进行中</p>
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>- `Failed`：失败</p>
     *
     * <p>- `Success`：成功</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>错误信息。仅当`Status`取值`Failed`时，有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Err")
    private String err;

    /**
     * <p>错误码。仅当`Status`取值`Failed`时，有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private Integer code;

    /**
     * <p>异步任务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
