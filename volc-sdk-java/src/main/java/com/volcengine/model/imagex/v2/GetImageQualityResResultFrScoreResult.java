package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageQualityResResultFrScoreResult
 */
@lombok.Data
public final class GetImageQualityResResultFrScoreResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vmaf")
    private Double vmaf;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ssim")
    private Double ssim;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Psnr")
    private Double psnr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
