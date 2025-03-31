package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsResResultExecInfoItemExecOutputEvalsItemValue
 */
@lombok.Data
public final class GetImageTranscodeDetailsResResultExecInfoItemExecOutputEvalsItemValue  {

    /**
     * <p>峰值信噪比。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PSNR")
    private Double pSNR;

    /**
     * <p>结构相似性指数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SSIM")
    private Double sSIM;

    /**
     * <p>视频多重评估函数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VMAF")
    private Double vMAF;

    /**
     * <p>视频质量评分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VQScore")
    private Double vQScore;

    /**
     * <p>噪声类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Noise")
    private Double noise;

    /**
     * <p>美学配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aesthetic")
    private Double aesthetic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
