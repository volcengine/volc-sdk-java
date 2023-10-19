package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigResResult
 */
@lombok.Data
public final class DescribeDenyConfigResResult  {

    /**
     * <p>配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyList")
    private List<DescribeDenyConfigResResultDenyListItem> denyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
