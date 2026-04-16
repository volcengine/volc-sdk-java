package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeForbiddenStreamGroupByPageResResult
 */
@lombok.Data
public final class DescribeForbiddenStreamGroupByPageResResult  {

    /**
     * <p>禁推流信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeForbiddenStreamGroupByPageResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>查询结果中禁推流的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoughCount")
    private Integer roughCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
