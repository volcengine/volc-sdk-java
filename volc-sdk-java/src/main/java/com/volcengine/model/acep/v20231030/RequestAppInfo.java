package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * RequestAppInfo
 */
@lombok.Data
public final class RequestAppInfo  {

    /**
     * <p>应用 ID，可通过调用 [ListApp](https://www.volcengine.com/docs/6394/1226894) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>应用版本 ID，可通过调用 [ListApp](https://www.volcengine.com/docs/6394/1226894) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionId")
    private String versionId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
