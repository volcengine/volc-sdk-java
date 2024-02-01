package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServiceQualityResResultClientData
 */
@lombok.Data
public final class DescribeImageXServiceQualityResResultClientData  {

    /**
     * <p>解码成功率</p>
     *
     * <p>:::tip</p>
     *
     * <p>解码成功率 = 1 - 解码失败次数 / 解码总次数</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRate")
    private Double successRate;

    /**
     * <p>平均解码耗时，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgDecodeDuration")
    private Double avgDecodeDuration;

    /**
     * <p>平均排队耗时，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgQueueDuration")
    private Double avgQueueDuration;

    /**
     * <p>平均加载耗时，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgLoadDuration")
    private Double avgLoadDuration;

    /**
     * <p>客户端总上报数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
