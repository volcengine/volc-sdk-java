package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetSegmentImageBodyContour
 */
@lombok.Data
public final class GetSegmentImageBodyContour  {

    /**
     * <p>描边颜色，支持以 HEX、HSL、RGP 表示。例如`HEX`中白色为`#FFFFFF`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Color")
    private String color;

    /**
     * <p>描边宽度，单位为 px。取值范围为 0 到正整数，默认 10px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
