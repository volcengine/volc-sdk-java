package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyVodParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyVodParam  {

    /**
     * <p>视频点播空间名称。可登录[视频点播控制台](https://console.volcengine.com/vod/)查询。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Space")
    private String space;

    /**
     * <p>视频点播工作流模板 ID，对于存储在点播的高光视频，会使用该工作流模版对视频进行处理，可登录[视频点播控制台](https://console.volcengine.com/vod/)获取工作流模板 ID，默认为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
