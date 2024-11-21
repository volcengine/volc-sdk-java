package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStylesQuery
 */
@lombok.Data
public final class GetImageStylesQuery  {

    /**
     * <p>样式类型。取值 user 表示用户样式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>需要返回的样式列表标识。</p>
     *
     * <p>* 返回的样式名称、样式 ID 包含了该值的样式列表。</p>
     *
     * <p>* 返回的样式宽度或样式高度为该值的样式列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    /**
     * <p>分页返回条数，取值范围为[0,100]，默认 10 条。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移，默认 0，取值为 1 时，表示跳过一条数据，从第二条数据取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
