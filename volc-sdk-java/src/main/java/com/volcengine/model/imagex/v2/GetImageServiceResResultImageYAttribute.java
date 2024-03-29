package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageServiceResResultImageYAttribute
 */
@lombok.Data
public final class GetImageServiceResResultImageYAttribute  {

    /**
     * <p>是否开启原图保护，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceProtect")
    private Boolean resourceProtect;

    /**
     * <p>样式分割符</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StyleSeparators")
    private List<String> styleSeparators;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
