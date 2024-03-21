package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeClosedStreamInfoByPageResResult
 */
@lombok.Data
public final class DescribeClosedStreamInfoByPageResResult  {

    /**
     * <p>历史直播流信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamInfoList")
    private List<DescribeClosedStreamInfoByPageResResultStreamInfoListItem> streamInfoList;

    /**
     * <p>查询结果中历史流的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoughCount")
    private Integer roughCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
