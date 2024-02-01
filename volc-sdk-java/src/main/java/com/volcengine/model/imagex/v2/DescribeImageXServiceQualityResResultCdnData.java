package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServiceQualityResResultCdnData
 */
@lombok.Data
public final class DescribeImageXServiceQualityResResultCdnData  {

    /**
     * <p>网络成功率</p>
     *
     * <p>:::tip</p>
     *
     * <p>网络成功率 = 1 - 下载失败次数 / 下载总数</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRate")
    private Double successRate;

    /**
     * <p>网络平均耗时，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgDuration")
    private Double avgDuration;

    /**
     * <p>下行总上报数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
