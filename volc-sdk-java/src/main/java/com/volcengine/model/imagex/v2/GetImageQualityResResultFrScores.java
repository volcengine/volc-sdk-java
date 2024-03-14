package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageQualityResResultFrScores
 */
@lombok.Data
public final class GetImageQualityResResultFrScores  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "psnr")
    private Double psnr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ssim")
    private Double ssim;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "vmaf")
    private Double vmaf;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
