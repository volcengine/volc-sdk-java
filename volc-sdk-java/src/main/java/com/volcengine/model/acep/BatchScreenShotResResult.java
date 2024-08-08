package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * BatchScreenShotResResult
 */
@lombok.Data
public final class BatchScreenShotResResult  {

    /**
     * <p>截图成功的实例列表。</p>
     *
     * <p>仅表示截图命令成功下发到实例，截图的结果通过回调获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SucceedList")
    private List<String> succeedList;

    /**
     * <p>截图失败的实例列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedList")
    private List<String> failedList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
