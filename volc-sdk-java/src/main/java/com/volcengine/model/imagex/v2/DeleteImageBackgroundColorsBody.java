package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageBackgroundColorsBody
 */
@lombok.Data
public final class DeleteImageBackgroundColorsBody  {

    /**
     * <p>待删除的颜色列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Colors")
    private List<String> colors;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
