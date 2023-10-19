package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCommonTransPresetDetailResResult
 */
@lombok.Data
public final class ListCommonTransPresetDetailResResult  {

    /**
     * <p>极智超清模板信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NarrowBandHDPresetDetail")
    private List<ListCommonTransPresetDetailResResultNarrowBandHDPresetDetailItem> narrowBandHDPresetDetail;

    /**
     * <p>标准模板信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StandardPresetDetail")
    private List<ListCommonTransPresetDetailResResultStandardPresetDetailItem> standardPresetDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
