package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientCountByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientCountByTimeResResult  {

    /**
     * <p>客户端上报量数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientCountData")
    private List<DescribeImageXClientCountByTimeResResultClientCountDataItem> clientCountData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
