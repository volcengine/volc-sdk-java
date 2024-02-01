package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateImageMirrorConfBodyOrigin
 */
@lombok.Data
public final class UpdateImageMirrorConfBodyOrigin  {

    /**
     * <p>镜像站类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>镜像站配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Param")
    private Map<String, Object> param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
