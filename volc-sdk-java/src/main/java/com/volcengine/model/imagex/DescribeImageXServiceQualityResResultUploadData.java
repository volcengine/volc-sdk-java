package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXServiceQualityResResultUploadData
 */
@lombok.Data
public final class DescribeImageXServiceQualityResResultUploadData  {

    /**
     * <p>上传成功率。</p>
     *
     * <p>:::tip</p>
     *
     * <p>上传成功率 = 上传成功次数 / 上传总有效次数</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessRate")
    private Double successRate;

    /**
     * <p>上传有效次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadCount")
    private Integer uploadCount;

    /**
     * <p>上传文件平均大小，单位字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgSize")
    private Double avgSize;

    /**
     * <p>上传平均耗时，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AvgDuration")
    private Double avgDuration;

    /**
     * <p>上传总上报数据量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
