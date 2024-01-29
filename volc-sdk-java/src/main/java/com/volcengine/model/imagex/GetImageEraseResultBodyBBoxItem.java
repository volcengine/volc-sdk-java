package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEraseResultBodyBBoxItem
 */
@lombok.Data
public final class GetImageEraseResultBodyBBoxItem  {

    /**
     * <p>待修复区域左上角的 X 坐标，取值范围为[0,1]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "X1")
    private Double x1;

    /**
     * <p>待修复区域左上角的 Y 坐标，取值范围为[0,1]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Y1")
    private Double y1;

    /**
     * <p>待修复区域右下角的 X 坐标，取值范围为[0,1]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "X2")
    private Double x2;

    /**
     * <p>待修复区域右下角的 Y 坐标，取值范围为[0,1]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Y2")
    private Double y2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
