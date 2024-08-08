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
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestCnt")
    private List<DescribeImageXEdgeRequestResResultRequestCntItem> requestCnt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
