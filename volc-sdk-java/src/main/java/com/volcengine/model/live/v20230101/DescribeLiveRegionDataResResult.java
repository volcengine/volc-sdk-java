package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRegionDataResResult
 */
@lombok.Data
public final class DescribeLiveRegionDataResResult  {

    /**
     * <p>区域信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Areas")
    private List<DescribeLiveRegionDataResResultAreasItem> areas;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
