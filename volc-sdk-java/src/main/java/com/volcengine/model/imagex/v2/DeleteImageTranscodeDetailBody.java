package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageTranscodeDetailBody
 */
@lombok.Data
public final class DeleteImageTranscodeDetailBody  {

    /**
     * <p>待删除的任务条目 ID，您可通过调用[GetImageTranscodeDetails](https://www.volcengine.com/docs/508/1107749)获取该账号下全部执行任务条目 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EntryId")
    private String entryId;

    /**
     * <p>待删除的任务条目 ID 列表，您可通过调用[GetImageTranscodeDetails](https://www.volcengine.com/docs/508/1107749)获取该账号下全部执行任务条目 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Entries")
    private List<String> entries;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
