package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageStyleDetailResResultStyle
 */
@lombok.Data
public final class GetImageStyleDetailResResultStyle  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "background")
    private GetImageStyleDetailResResultStyleBackground background;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "elements")
    private List<GetImageStyleDetailResResultStyleElementsItem> elements;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "height")
    private Integer height;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "id")
    private String id;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "name")
    private String name;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "output")
    private GetImageStyleDetailResResultStyleOutput output;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "service")
    private String service;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "unit")
    private String unit;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "width")
    private Integer width;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
