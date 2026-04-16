package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamGroupByPageResResultStreamInfoListItemStreamInfoDetailsItem
 */
@lombok.Data
public final class DescribeLiveStreamGroupByPageResResultStreamInfoListItemStreamInfoDetailsItem  {

    /**
     * <p>在线流开始推流的时间。遵循 RFC3339 格式的 UTC 时间，精度为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionStartTime")
    private String sessionStartTime;

    /**
     * <p>流的优先级。数值越大，优先级越高。优先级最高的流为主流，其余流根据优先级决定备流切换顺序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Priority")
    private String priority;

    /**
     * <p>是否为备流。取值如下：</p>
     *
     * <p>- `true`：备流。</p>
     *
     * <p>- `false`：主流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsBackUp")
    private Boolean isBackUp;

    /**
     * <p>在线流的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>是否强制优先。取值如下：</p>
     *
     * <p>- `true`：强制优先，即无视优先级，强制设置为主流。</p>
     *
     * <p>- `false`：不强制优先。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsForcePriority")
    private Boolean isForcePriority;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
