package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCarouselTaskBody
 */
@lombok.Data
public final class ListCarouselTaskBody  {

    /**
     * <p>查询数据的页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>每页显示的数据条数，最大值为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
