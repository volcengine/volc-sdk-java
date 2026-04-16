package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamGroupByPageResResult
 */
@lombok.Data
public final class DescribeLiveStreamGroupByPageResResult  {

    /**
     * <p>在线流信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeLiveStreamGroupByPageResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>查询结果中在线流的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoughCount")
    private Integer roughCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
