package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStylesResResultStylesItem
 */
@lombok.Data
public final class GetImageStylesResResultStylesItem  {

    /**
     * <p>样式渲染结果图的TOS URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    /**
     * <p>样式创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private String createAt;

    /**
     * <p>样式更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private String updateAt;

    /**
     * <p>样式高</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>样式ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private String id;

    /**
     * <p>样式名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>样式绑定的服务ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Service")
    private String service;

    /**
     * <p>尺寸单位。当前仅支持取值px表示像素。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Unit")
    private String unit;

    /**
     * <p>样式宽</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
