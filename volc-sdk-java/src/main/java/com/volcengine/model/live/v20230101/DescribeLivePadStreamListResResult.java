package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePadStreamListResResult
 */
@lombok.Data
public final class DescribeLivePadStreamListResResult  {

    /**
     * <p>流列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamList")
    private List<DescribeLivePadStreamListResResultStreamListItem> streamList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
