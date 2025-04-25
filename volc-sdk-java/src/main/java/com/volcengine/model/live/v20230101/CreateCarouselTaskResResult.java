package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskResResult
 */
@lombok.Data
public final class CreateCarouselTaskResResult  {

    /**
     * <p>轮播任务数据对象。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private CreateCarouselTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
