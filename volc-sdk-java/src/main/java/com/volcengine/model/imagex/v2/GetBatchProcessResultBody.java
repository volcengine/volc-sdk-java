package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetBatchProcessResultBody
 */
@lombok.Data
public final class GetBatchProcessResultBody  {

    /**
     * <p>待批量处理的资源链接信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BatchingInfo")
    private List<GetBatchProcessResultBodyBatchingInfoItem> batchingInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
