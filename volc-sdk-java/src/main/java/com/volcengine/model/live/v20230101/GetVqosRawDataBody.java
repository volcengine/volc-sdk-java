package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetVqosRawDataBody
 */
@lombok.Data
public final class GetVqosRawDataBody  {

    /**
     * <p>指标</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Metrics")
    private List<String> metrics;

    /**
     * <p>维度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dimensions")
    private List<String> dimensions;

    /**
     * <p>开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Start")
    private Integer start;

    /**
     * <p>结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "End")
    private Integer end;

    /**
     * <p>时间聚合窗口大小</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Window")
    private String window;

    /**
     * <p>Limit类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitType")
    private String limitType;

    /**
     * <p>过滤条件</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Filter")
    private GetVqosRawDataBodyFilter filter;

    /**
     * <p>查询的数据点偏移量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>最多返回数据点数/图例数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
