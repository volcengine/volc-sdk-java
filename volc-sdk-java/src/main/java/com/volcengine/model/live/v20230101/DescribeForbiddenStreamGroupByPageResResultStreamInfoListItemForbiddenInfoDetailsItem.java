package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamGroupByPageResResultStreamInfoListItemForbiddenInfoDetailsItem
 */
@lombok.Data
public final class DescribeForbiddenStreamGroupByPageResResultStreamInfoListItemForbiddenInfoDetailsItem  {

    /**
     * <p>禁推流被禁推的开始时间。遵循 RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>禁推流结束禁推的时间。遵循 RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>流的优先级。数值越大，优先级越高。优先级最高的流为主流，其余流根据优先级决定备流切换顺序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private Long priority;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
