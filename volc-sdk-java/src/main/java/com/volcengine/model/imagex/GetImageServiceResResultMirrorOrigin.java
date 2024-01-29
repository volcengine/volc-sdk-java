package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageServiceResResultMirrorOrigin
 */
@lombok.Data
public final class GetImageServiceResResultMirrorOrigin  {

    /**
     * <p>镜像源站类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>镜像源站参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Param")
    private Map<String, Object> param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
