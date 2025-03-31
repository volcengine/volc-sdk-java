package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetProductAIGCResultResResult
 */
@lombok.Data
public final class GetProductAIGCResultResResult  {

    /**
     * <p>生成的商品卖点图 URI 列表。排序规则为，当存在`SDScores > 0`的返回结果时，首个返回结果为`SDScores > 0`且总分(SDScores+AestheticScores)最高的结果图 URI，否则首个返回结果为`SDScores < 0`且总分最高的结果；其余结果按总分降序排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellpointImages")
    private List<String> sellpointImages;

    /**
     * <p>商品场景图对应的美学得分，值越高表示图片越符合美学测评。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AestheticScores")
    private List<Double> aestheticScores;

    /**
     * <p>商品场景图与正向提示词的匹配度得分，值越高表示匹配度越高。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SDScores")
    private List<Double> sDScores;

    /**
     * <p>卖点文本信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointText")
    private String sellingPointText;

    /**
     * <p>商品场景图 URI 列表，未采用文字卖点。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BackgroundImages")
    private List<String> backgroundImages;

    /**
     * <p>指定的卖点渲染模板</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointRenderTemplate")
    private String sellingPointRenderTemplate;

    /**
     * <p>指定的商品信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private String extra;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ComposedJsons")
    private List<Map<String, Object>> composedJsons;

    /**
     * <p>AIGC图像评分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AigcImageScores")
    private Map<String, List<Double>> aigcImageScores;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
