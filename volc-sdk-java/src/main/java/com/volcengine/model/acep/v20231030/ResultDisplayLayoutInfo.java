package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultDisplayLayoutInfo
 */
@lombok.Data
public final class ResultDisplayLayoutInfo  {

    /**
     * <p>屏幕刷新率，默认60fps，枚举值 30fps 60fps 120fps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Fps")
    private Integer fps;

    /**
     * <p>屏幕滑动，上临近屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Top")
    private String top;

    /**
     * <p>屏幕滑动，左临近屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Left")
    private String left;

    /**
     * <p>附加参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private String extra;

    /**
     * <p>屏幕滑动，右临近屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Right")
    private String right;

    /**
     * <p>屏幕名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>屏幕宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>屏幕滑动，下临近屏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bottom")
    private String bottom;

    /**
     * <p>屏幕高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>屏幕像素密度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Density")
    private Integer density;

    /**
     * <p>当前屏幕排索引</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RowIndex")
    private Integer rowIndex;

    /**
     * <p>屏幕布局总排数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RowTotal")
    private Integer rowTotal;

    /**
     * <p>屏幕所属音区</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioZone")
    private Integer audioZone;

    /**
     * <p>屏幕编号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayId")
    private String displayId;

    /**
     * <p>当前屏幕列索引</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ColumnIndex")
    private Integer columnIndex;

    /**
     * <p>当前屏幕所在排总列数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ColumnTotal")
    private Integer columnTotal;

    /**
     * <p>屏幕类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayType")
    private Integer displayType;

    /**
     * <p>在nav_bar_position为1、2时设置有效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NavBarWidth")
    private Integer navBarWidth;

    /**
     * <p>在nav_bar_position为0时设置有效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NavBarHeight")
    private Integer navBarHeight;

    /**
     * <p>三个有效值：0-底部 1-左侧 2-右侧</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NavBarPosition")
    private Integer navBarPosition;

    /**
     * <p>状态栏高度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusBarHeight")
    private Integer statusBarHeight;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
