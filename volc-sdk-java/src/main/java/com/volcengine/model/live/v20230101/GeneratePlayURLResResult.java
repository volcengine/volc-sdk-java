package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GeneratePlayURLResResult
 */
@lombok.Data
public final class GeneratePlayURLResResult  {

    /**
     * <p>拉流地址信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URLList")
    private List<GeneratePlayURLResResultURLListItem> uRLList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
