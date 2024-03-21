package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeForbiddenStreamInfoByPageResResult
 */
@lombok.Data
public final class DescribeForbiddenStreamInfoByPageResResult  {

    /**
     * <p>禁推流的信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeForbiddenStreamInfoByPageResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>查询结果中禁推流数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoughCount")
    private Integer roughCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
