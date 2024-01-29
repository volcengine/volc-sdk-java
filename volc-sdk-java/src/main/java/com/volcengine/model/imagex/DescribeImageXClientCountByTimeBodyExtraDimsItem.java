package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientCountByTimeBodyExtraDimsItem
 */
@lombok.Data
public final class DescribeImageXClientCountByTimeBodyExtraDimsItem  {

    /**
     * <p>自定义维度名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取自定义维度列表](https://www.volcengine.com/docs/508/34554)来获取。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dim")
    private String dim;

    /**
     * <p>需要匹配的对应维度值</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取自定义维度值](https://www.volcengine.com/docs/508/34555)来获取。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vals")
    private List<String> vals;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
