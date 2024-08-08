package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetAppCrashLogResResult
 */
@lombok.Data
public final class GetAppCrashLogResResult  {

    /**
     * <p>查询到的应用崩溃信息，详情参看 `AppCrashLog` 数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppCrashLogList")
    private List<com.volcengine.model.acep.v20231030.ResultAppCrashLog> appCrashLogList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
