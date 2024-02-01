package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXEdgeRequestResResult
 */
@lombok.Data
public final class DescribeImageXEdgeRequestResResult  {

    /**
     * <p>数据列表</p>
     *
     * <p>:::tip</p>
     *
     * <p>* 若未设置`Interval`，则上报一条`StartTime`与`EndTime`时间段内查询的全部请求次数据；</p>
     *
     * <p>* 若设置了`Interval`，则按`Interval`粒度分段上报查询的时间粒度内请求次数据；</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestCnt")
    private List<DescribeImageXEdgeRequestResResultRequestCntItem> requestCnt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
