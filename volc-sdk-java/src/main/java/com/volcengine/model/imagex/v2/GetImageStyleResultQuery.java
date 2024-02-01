package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleResultQuery
 */
@lombok.Data
public final class GetImageStyleResultQuery  {

    /**
     * <p>图片渲染所用样式关联的服务的 ID，用于计量计费和渲染结果的存储。获取方式请参见[如何获取调用参数](https://www.volcengine.com/docs/508/105396)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
