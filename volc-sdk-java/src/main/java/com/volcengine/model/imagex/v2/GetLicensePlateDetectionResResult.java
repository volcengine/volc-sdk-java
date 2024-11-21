package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetLicensePlateDetectionResResult
 */
@lombok.Data
public final class GetLicensePlateDetectionResResult  {

    /**
     * <p>检测到的车牌位置坐标</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Locations")
    private List<GetLicensePlateDetectionResResultLocationsItem> locations;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
