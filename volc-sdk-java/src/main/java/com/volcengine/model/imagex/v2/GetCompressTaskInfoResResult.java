package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCompressTaskInfoResResult
 */
@lombok.Data
public final class GetCompressTaskInfoResResult  {

    /**
     * <p>异步任务状态，取值如下所示：</p>
     *
     *
     *
     * <p>- `Pending`：排队中</p>
     *
     * <p>	</p>
     *
     * <p>- `Running`：进行中</p>
     *
     * <p>	</p>
     *
     * <p>- `Failed`：执行失败</p>
     *
     * <p>	</p>
     *
     * <p>- `Success`：执行成功</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>错误码。仅当`Status`为`Failed`时，该值不为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private Integer errCode;

    /**
     * <p>错误信息。仅当`Status`为`Failed`时，该值不为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>压缩文件包 StoreUri</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputUri")
    private String outputUri;

    /**
     * <p>任务处理进度，即已处理的文件数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProcessCount")
    private Long processCount;

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
