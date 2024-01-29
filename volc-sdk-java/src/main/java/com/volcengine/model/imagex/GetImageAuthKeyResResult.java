package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAuthKeyResResult
 */
@lombok.Data
public final class GetImageAuthKeyResResult  {

    /**
     * <p>指定的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>该服务的主鉴权 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrimaryKey")
    private String primaryKey;

    /**
     * <p>该服务的备鉴权 Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecondaryKey")
    private String secondaryKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
