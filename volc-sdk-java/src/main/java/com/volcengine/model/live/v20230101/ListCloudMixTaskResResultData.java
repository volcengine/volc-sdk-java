package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCloudMixTaskResResultData
 */
@lombok.Data
public final class ListCloudMixTaskResResultData  {

    /**
     * <p>查询结果的数据总条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>查询结果数据详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<ListCloudMixTaskResResultDataResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
