package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * BatchUpdateUserTagsBody
 */
@lombok.Data
public final class BatchUpdateUserTagsBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>标签更新方式。</p>
     *
     * <p> 0：对于重复 key，覆盖 value，对于新 key，进行添加 </p>
     *
     * <p> 1：删除重复 key </p>
     *
     * <p> 默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Op")
    private Integer op;

    /**
     * <p>用户标签</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<String> tags;

    /**
     * <p>用户userId列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserIds")
    private List<Long> userIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
