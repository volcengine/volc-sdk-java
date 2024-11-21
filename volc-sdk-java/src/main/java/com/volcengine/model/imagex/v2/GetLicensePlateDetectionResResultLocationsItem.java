package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetLicensePlateDetectionResResultLocationsItem
 */
@lombok.Data
public final class GetLicensePlateDetectionResResultLocationsItem  {

    /**
     * <p>车牌区域左上角 X 轴坐标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "X1")
    private Integer x1;

    /**
     * <p>车牌区域左上角 Y 轴坐标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Y1")
    private Integer y1;

    /**
     * <p>车牌区域右下角 X 轴坐标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "X2")
    private Integer x2;

    /**
     * <p>车牌区域右下角 Y 轴坐标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Y2")
    private Integer y2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
