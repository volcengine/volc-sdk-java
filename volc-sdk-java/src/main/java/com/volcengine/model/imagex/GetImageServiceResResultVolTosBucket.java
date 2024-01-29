package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultVolTosBucket
 */
@lombok.Data
public final class GetImageServiceResResultVolTosBucket  {

    /**
     * <p>绑定存储桶名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
