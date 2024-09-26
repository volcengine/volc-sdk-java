package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCloudMixTaskBodyMixedRulesOutputCallback
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRulesOutputCallback  {

    /**
     * <p>接收云端混流任务状态回调的 HTTP 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
