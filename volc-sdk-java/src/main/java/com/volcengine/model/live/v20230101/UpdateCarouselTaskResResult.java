package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskResResult
 */
@lombok.Data
public final class UpdateCarouselTaskResResult  {

    /**
     * <p>包含任务更新相关信息的数据对象。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private UpdateCarouselTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
