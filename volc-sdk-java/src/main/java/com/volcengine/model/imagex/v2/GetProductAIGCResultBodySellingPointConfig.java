package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetProductAIGCResultBodySellingPointConfig
 */
@lombok.Data
public final class GetProductAIGCResultBodySellingPointConfig  {

    /**
     * <p>与 `SellingPointRenderTemplate` 搭配使用，视为方式 1。若同时配置方式 1 与方式 2，则方式 1 优先生效。</p>
     *
     *
     *
     * <p>卖点文本。填写方式为 "maidian1\nmaidian2\nmaidian3"或者"0.mdian1\n1.maindian2\n3.maiian"，支持中英文，每个卖点字符限制 5 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointText")
    private String sellingPointText;

    /**
     * <p>与 `ProductDetailImages` 搭配使用，视为方式 2。若同时配置方式 1 与方式 2，则方式 1 优先生效。</p>
     *
     *
     *
     * <p>商详图中的商品卖点描述，支持中英文，不得超过 430 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductDescription")
    private String productDescription;

    /**
     * <p>商详图（带有商品描述） URI/URL 列表，最大支持三张。</p>
     *
     * <p>- 指定 URI 时：需满足该图片时指定该服务下存储。</p>
     *
     * <p>- 指定 URL 时：满足公网可访问。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductDetailImages")
    private List<String> productDetailImages;

    /**
     * <p>指定的商品场景图访问 URL（公网可访问）。若为空，将采用`Scene` 或提示词智能生成的场景图。</p>
     *
     *
     *
     * <p>- 指定场景图时，若指定了任一方式的卖点信息，则在指定场景图渲染卖点文本。</p>
     *
     * <p>- 指定为空时，若指定了任一方式的卖点信息，则在 `Scene` 或提示词生成的场景图渲染卖点文本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BackgroundUrl")
    private String backgroundUrl;

    /**
     * <p>卖点渲染模板，固定取值为 `default`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointRenderTemplate")
    private String sellingPointRenderTemplate;

    /**
     * <p>场景图对应图层ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProdUniqueId")
    private String prodUniqueId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointExtractConfig")
    private List<GetProductAIGCResultBodySellingPointConfigSellingPointExtractConfigItem> sellingPointExtractConfig;

    /**
     * <p>卖点渲染时的图层设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointRenderStyle")
    private Map<String, Object> sellingPointRenderStyle;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
