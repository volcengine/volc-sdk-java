package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageResourceStatusBody
 */
@lombok.Data
public final class UpdateImageResourceStatusBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectName")
    private String objectName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
