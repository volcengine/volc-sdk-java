package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAddOnTagResResult
 */
@lombok.Data
public final class GetImageAddOnTagResResult  {

    /**
     * <p>账号内的可见的附加组件标签名称，一个标签下可以包含多个组件功能。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tag")
    private List<String> tag;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
