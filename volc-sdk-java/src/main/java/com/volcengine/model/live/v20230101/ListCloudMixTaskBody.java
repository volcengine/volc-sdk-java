package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCloudMixTaskBody
 */
@lombok.Data
public final class ListCloudMixTaskBody  {

    /**
     * <p>每页显示的数据条数，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>查询数据的页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
