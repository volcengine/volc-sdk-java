package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentBlockListResResultDataItem
 */
@lombok.Data
public final class GetImageContentBlockListResResultDataItem  {

    /**
     * <p>指定的 URL</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>URL 状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "State")
    private String state;

    /**
     * <p>任务进度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Process")
    private String process;

    /**
     * <p>任务的创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private Long createTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
