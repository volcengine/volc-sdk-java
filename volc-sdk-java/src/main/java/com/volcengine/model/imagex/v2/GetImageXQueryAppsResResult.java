package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageXQueryAppsResResult
 */
@lombok.Data
public final class GetImageXQueryAppsResResult  {

    /**
     * <p>火山引擎账号内的所有 App 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Apps")
    private List<GetImageXQueryAppsResResultAppsItem> apps;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
