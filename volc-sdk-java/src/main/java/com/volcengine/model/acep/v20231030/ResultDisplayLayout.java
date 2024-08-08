package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * ResultDisplayLayout
 */
@lombok.Data
public final class ResultDisplayLayout  {

    /**
     * <p>屏幕信息，key为屏幕编号，value为屏幕信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rows")
    private Map<String, ResultDisplayLayoutInfo> rows;

    /**
     * <p>创建时间戳</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>屏幕编号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LayoutId")
    private String layoutId;

    /**
     * <p>屏幕布局总排数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RowTotal")
    private Integer rowTotal;

    /**
     * <p>业务 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>屏幕名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LayoutName")
    private String layoutName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScreenType")
    private Integer screenType;

    /**
     * <p>屏幕布局中屏幕总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayTotal")
    private Integer displayTotal;

    /**
     * <p>屏幕布局音区总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioZoneTotal")
    private Integer audioZoneTotal;

    /**
     * <p>是否是系统布局配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsSystemConfig")
    private Boolean isSystemConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
