package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageElementsResResult
 */
@lombok.Data
public final class DeleteImageElementsResResult  {

    /**
     * <p>删除失败的 StoreUri 列表。若全部删除失败，则接口将返回失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedList")
    private List<String> failedList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
