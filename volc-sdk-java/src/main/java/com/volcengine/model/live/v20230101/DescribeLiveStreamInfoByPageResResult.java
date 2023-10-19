package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamInfoByPageResResult
 */
@lombok.Data
public final class DescribeLiveStreamInfoByPageResResult  {

    /**
     * <p>流信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeLiveStreamInfoByPageResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>当前分页的在线流数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoughCount")
    private Integer roughCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
