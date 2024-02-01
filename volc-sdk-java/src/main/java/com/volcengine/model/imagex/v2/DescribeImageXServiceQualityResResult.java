package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServiceQualityResResult
 */
@lombok.Data
public final class DescribeImageXServiceQualityResResult  {

    /**
     * <p>用户感知失败率，为当日 0 点至查询时间的整体数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailureRate")
    private Double failureRate;

    /**
     * <p>上传概览数据，为当日 0 点查询时间的整体数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadData")
    private DescribeImageXServiceQualityResResultUploadData uploadData;

    /**
     * <p>下行概览数据，为当日 0 点至今整体数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CdnData")
    private DescribeImageXServiceQualityResResultCdnData cdnData;

    /**
     * <p>客户端概览数据，为当日 0 点查询时间的整体数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientData")
    private DescribeImageXServiceQualityResResultClientData clientData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
