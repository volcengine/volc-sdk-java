package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCarouselTaskResResult
 */
@lombok.Data
public final class ListCarouselTaskResResult  {

    /**
     * <p>轮播任务数据对象。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private ListCarouselTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
