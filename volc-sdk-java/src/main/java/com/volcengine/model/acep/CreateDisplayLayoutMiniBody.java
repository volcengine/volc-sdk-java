package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreateDisplayLayoutMiniBody
 */
@lombok.Data
public final class CreateDisplayLayoutMiniBody  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务信息」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>屏幕布局 ID，支持的最大长度为 64 字节，只支持大小写字母、数字、下划线（_）、中划线（-），在同一业务下唯一，一个业务下最多可创建 100 个屏幕布局配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>屏幕宽度，取值范围在 [200, 3840] 区间的偶数，默认值为 1080，单位：px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>屏幕高度，取值范围在 [200, 3840] 区间的偶数，默认值为 1920，单位：px。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>屏幕像素密度，单位：dpi。包含以下值：</p>
     *
     * <p>- 160</p>
     *
     * <p>- 240</p>
     *
     * <p>- 320（默认值）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Density")
    private Integer density;

    /**
     * <p>屏幕刷新率，单位：fps。包含以下值：</p>
     *
     * <p>- 30</p>
     *
     * <p>- 60（默认值）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Fps")
    private Integer fps;

    /**
     * <p>备注信息，长度不超过 32 字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private String extra;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
