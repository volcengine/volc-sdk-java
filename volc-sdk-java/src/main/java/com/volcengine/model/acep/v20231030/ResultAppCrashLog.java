package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultAppCrashLog
 */
@lombok.Data
public final class ResultAppCrashLog  {

    /**
     * <p>应用崩溃信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Msg")
    private String msg;

    /**
     * <p>实例 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    /**
     * <p>应用崩溃时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CrashTime")
    private Long crashTime;

    /**
     * <p>应用包名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
