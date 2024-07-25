package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreateDisplayLayoutMiniResResult
 */
@lombok.Data
public final class CreateDisplayLayoutMiniResResult  {

    /**
     * <p>屏幕布局 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>屏幕宽度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>屏幕高度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>屏幕像素密度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Density")
    private Integer density;

    /**
     * <p>屏幕刷新率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Fps")
    private Integer fps;

    /**
     * <p>备注信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private String extra;

    /**
     * <p>屏幕布局创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>是否为系统屏幕布局配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsSystemConfig")
    private Boolean isSystemConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
