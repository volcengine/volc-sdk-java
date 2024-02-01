package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetImageStyleResultBody
 */
@lombok.Data
public final class GetImageStyleResultBody  {

    /**
     * <p>图片渲染所用样式的样式 ID。获取方法请参见[如何获取样式 ID](https://www.volcengine.com/docs/508/105396#如何获取创意魔方的样式-id？)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StyleId")
    private String styleId;

    /**
     * <p>样式中的动态要素和要素取值。格式为 `"Key":"Value"`，例如，`"el17fbb3a2134*":"Hello,World",`</p>
     *
     * <p>- Key：表示要素 ID，String 类型。获取方式请参见[如何获取要素 ID](https://www.volcengine.com/docs/508/105396#如何获取创意魔方样式中的动态要素-id？)；</p>
     *
     * <p>- Value：表示要素的取值，String 类型。需要您根据实际需求自定义，例如，自定义图片地址、文本及二维码等内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Params")
    private Map<String, String> params;

    /**
     * <p>渲染结果图的编码格式，默认值为 webp。取值如下所示：</p>
     *
     * <p>- jpeg</p>
     *
     * <p>- webp</p>
     *
     * <p>- png</p>
     *
     * <p>- heic</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputFormat")
    private String outputFormat;

    /**
     * <p>渲染结果图的编码质量。默认为 75，取值范围为 [1,100]，值越大，结果图的质量越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputQuality")
    private Integer outputQuality;

    /**
     * <p>要素属性，结构请参考[样式定义](https://www.volcengine.com/docs/508/127402#%E6%A0%B7%E5%BC%8F%E5%AE%9A%E4%B9%89)。<br>此参数不为空则使用自定义参数内容替换样式定义中对应 [elements](https://www.volcengine.com/docs/508/127402#____elements) 的相关属性值。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 要素类型不允许更改；</p>
     *
     * <p>- 若`elements`和`params`两个参数同时指定了某个要素的内容，则以`elements`中指定的为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "elements")
    private List<Map<String, Object>> elements;

    /**
     * <p>样式背景，结构请参考[样式定义](https://www.volcengine.com/docs/508/127402#%E6%A0%B7%E5%BC%8F%E5%AE%9A%E4%B9%89)。<br>此参数不为空则使用自定义参数内容替换样式定义中的 [background](https://www.volcengine.com/docs/508/127402#background) 属性值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "background")
    private Map<String, Object> background;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
