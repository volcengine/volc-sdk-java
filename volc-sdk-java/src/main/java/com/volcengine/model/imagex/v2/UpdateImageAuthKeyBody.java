package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAuthKeyBody
 */
@lombok.Data
public final class UpdateImageAuthKeyBody  {

    /**
     * <p>主鉴权 key，长度为 8-32 字节，为空则不更新主鉴权值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrimaryKey")
    private String primaryKey;

    /**
     * <p>备鉴权 key，长度为 8-32 字节，为空则不更新备鉴权值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecondaryKey")
    private String secondaryKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
