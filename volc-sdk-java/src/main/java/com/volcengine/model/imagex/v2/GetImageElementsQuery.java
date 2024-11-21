package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageElementsQuery
 */
@lombok.Data
public final class GetImageElementsQuery  {

    /**
     * <p>要素类型，取值如下所示：</p>
     *
     * <p>* image：图片要素；</p>
     *
     * <p>* background：背景要素；</p>
     *
     * <p>* mask：蒙版要素。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>返回图片 URI 中包含该值的要素列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    /**
     * <p>分页返回条数。默认 10，最大限制为 100。</p>
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
