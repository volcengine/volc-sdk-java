package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * AddImageBackgroundColorsBody
 */
@lombok.Data
public final class AddImageBackgroundColorsBody  {

    /**
     * <p>待添加的颜色列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Colors")
    private List<String> colors;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
