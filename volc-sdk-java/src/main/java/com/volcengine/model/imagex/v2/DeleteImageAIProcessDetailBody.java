package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageAIProcessDetailBody
 */
@lombok.Data
public final class DeleteImageAIProcessDetailBody  {

    /**
     * <p>待删除条目的 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>至少传入 `EntryId` 和 `Entries` 其中之一。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    /**
     * <p>待批量删除条目的 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>至少传入 `EntryId` 和 `Entries` 其中之一。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Entries")
    private List<String> entries;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
