package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

/**
 * BatchUpdateUserItem
 */
@lombok.Data
public final class BatchUpdateUserItem {

    /**
     * <p>用户id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>扩展字段。`key` 的类型为 string，`value` 的类型为 string。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ext")
    private Map<String, String> ext;

    /**
     * <p>标签</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tags")
    private List<String> tags;

    /**
     * <p>头像 url</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Portrait")
    private String portrait;

    /**
     * <p>昵称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NickName")
    private String nickName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
