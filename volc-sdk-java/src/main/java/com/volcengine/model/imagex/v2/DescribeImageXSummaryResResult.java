package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryResResult
 */
@lombok.Data
public final class DescribeImageXSummaryResResult  {

    /**
     * <p>当月流量用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CdnTrafficData")
    private DescribeImageXSummaryResResultCdnTrafficData cdnTrafficData;

    /**
     * <p>当月带宽用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CdnBandwidthData")
    private DescribeImageXSummaryResResultCdnBandwidthData cdnBandwidthData;

    /**
     * <p>当月资源占用量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageData")
    private DescribeImageXSummaryResResultStorageData storageData;

    /**
     * <p>当月源站请求次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestCntData")
    private DescribeImageXSummaryResResultRequestCntData requestCntData;

    /**
     * <p>当月图像处理量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BaseOpData")
    private DescribeImageXSummaryResResultBaseOpData baseOpData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
