package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageObjectAccessBody
 */
@lombok.Data
public final class UpdateImageObjectAccessBody  {

    /**
     * <p>是否开启源地址访问，取值如下所示：</p>
     *
     * <p>* true：开启源地址访问</p>
     *
     * <p>* false：关闭源地址访问</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ObjectAccess")
    private Boolean objectAccess;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
