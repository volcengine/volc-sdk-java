package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageHmExtractTaskInfoResResult
 */
@lombok.Data
public final class GetImageHmExtractTaskInfoResResult  {

    /**
     * <p>提取出的盲水印文本信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HmInfo")
    private String hmInfo;

    /**
     * <p>任务状态。</p>
     *
     * <p>- `Pending`：未开始</p>
     *
     * <p>- `Running`：盲水印信息匹配中</p>
     *
     * <p>- `Success`：提取成功</p>
     *
     * <p>- `Failed`：提取失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskStatus")
    private String taskStatus;

    /**
     * <p>错误信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
