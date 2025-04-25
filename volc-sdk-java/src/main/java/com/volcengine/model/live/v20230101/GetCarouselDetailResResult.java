package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCarouselDetailResResult
 */
@lombok.Data
public final class GetCarouselDetailResResult  {

    /**
     * <p>包含轮播任务相关信息的数据对象。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private GetCarouselDetailResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
