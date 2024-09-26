package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskResResultData
 */
@lombok.Data
public final class UpdateCloudMixTaskResResultData  {

    /**
     * <p>任务版本标识符，用来标识更新后的任务版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OptID")
    private Integer optID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
