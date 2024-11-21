package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageStyleDetailResResultStyleElementsItemAttr
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyleElementsItemAttr  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "viewpoint")
    private GetImageStyleDetailResResultStyleElementsItemAttrViewpoint viewpoint;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fillptn")
    private GetImageStyleDetailResResultStyleElementsItemAttrFillptn fillptn;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "filter")
    private List<String> filter;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "font")
    private String font;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fontSize")
    private Integer fontSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fontAdapt")
    private Boolean fontAdapt;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "textAlign")
    private Integer textAlign;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "textAlignH")
    private Integer textAlignH;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "lineSpace")
    private Double lineSpace;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "wordSpace")
    private Integer wordSpace;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "writingMode")
    private Integer writingMode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "bold")
    private Boolean bold;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "oblique")
    private Boolean oblique;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "linethrough")
    private Boolean linethrough;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "underline")
    private Boolean underline;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "adapt")
    private Boolean adapt;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "border")
    private GetImageStyleDetailResResultStyleElementsItemAttrBorder border;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type")
    private Integer type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
