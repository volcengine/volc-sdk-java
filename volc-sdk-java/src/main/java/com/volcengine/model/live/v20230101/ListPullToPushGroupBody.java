package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushGroupBody
 */
@lombok.Data
public final class ListPullToPushGroupBody  {

    /**
     * <p>查询数据的页码，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页现实的数据条数，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>群组的状态，取值及含义如下所示。</p>
     *
     * <p>- `0`: （默认值）可用;</p>
     *
     * <p>- `1`: 已删除，不可用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusList")
    private List<Integer> statusList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
