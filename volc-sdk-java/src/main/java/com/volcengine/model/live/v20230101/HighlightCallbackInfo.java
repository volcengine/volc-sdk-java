package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * HighlightCallbackInfo
 */
@lombok.Data
public final class HighlightCallbackInfo  {

    /**
     * <p>高光剪辑任务生产回调的状态码，用于标识生产过程的当前状态。</p>
     *
     * <p>- `100`：表示生产成功，任务将持续生产；</p>
     *
     * <p>- `200`：表示生产完成，任务退出；</p>
     *
     * <p>- `500`：表示当前生产回调失败，但任务仍会持续生产；</p>
     *
     * <p>- `1000`：表示高光剪辑生产失败，任务停止。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "code")
    private Long code;

    /**
     * <p>高光剪辑生产结果的详细信息，包含高光剪辑片段和高光混剪结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private HLOutputInfo output;

    /**
     * <p>高光剪辑任务的唯一标识符，用于标识特定的高光剪辑生产任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>高光剪辑任务生产状态码，可能的取值如下所示。</p>
     *
     * <p>- `Continue`：表示生产成功，持续生产；</p>
     *
     * <p>- `OK`：表示生产完成，任务退出；</p>
     *
     * <p>- `Error`：表示当前生产回调失败，并且任务还会持续生产；</p>
     *
     * <p>- `Fatal`：表示高光剪辑生产失败，任务停止。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "status")
    private String status;

    /**
     * <p>高光剪辑任务生产过程中的描述信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "message")
    private String message;

    /**
     * <p>高光剪辑任务创建时的自定义其他信息，用于传递额外的任务相关数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraData")
    private String extraData;

    /**
     * <p>高光剪辑任务生产过程中的异常信息，用于描述生产失败的具体原因。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "exception")
    private String exception;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
