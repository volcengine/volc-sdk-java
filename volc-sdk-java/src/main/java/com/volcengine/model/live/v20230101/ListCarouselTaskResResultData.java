package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCarouselTaskResResultData
 */
@lombok.Data
public final class ListCarouselTaskResResultData  {

    /**
     * <p>满足查询条件的轮播任务总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>轮播任务的数组，每个元素表示一个任务的详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<ListCarouselTaskResResultDataResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
