package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateSpeechTaskResResultData
 */
@lombok.Data
public final class UpdateSpeechTaskResResultData  {

    /**
     * <p>任务更新序列号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OptID")
    private Integer optID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
