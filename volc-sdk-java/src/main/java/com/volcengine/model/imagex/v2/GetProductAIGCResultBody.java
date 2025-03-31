package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetProductAIGCResultBody
 */
@lombok.Data
public final class GetProductAIGCResultBody  {

    /**
     * <p>商品主体图的访问 URL（公网可访问）。建议为包含完整商品主体的白底图或透底图，尽量避免复杂背景的影响，以确保最终生成效果的质量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>是否使用分割处理图片，取值如下所示：</p>
     *
     * <p>- `true`：分隔处理。</p>
     *
     * <p>- `false`：（默认）不分割处理，将从输入图像读取 alpha 通道作为商品图数据。</p>
     *
     * <p>	:::warning</p>
     *
     * <p>	指定为 `false` 时，确保通过 `Url` 传入的商品主体图是已经过分割的白底图或透底图。</p>
     *
     * <p>	:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedSeg")
    private Boolean needSeg;

    /**
     * <p>每次生成的图片数量，取值范围为 [1,4]，默认值为 4。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BatchSize")
    private Integer batchSize;

    /**
     * <p>输入到 AIGC 模型的负向提示词，提示词和 `Scene` 二选一必填。两者均存在时，以 `Scene` 为准。当前仅支持英文，最多不超过 300 个字母。</p>
     *
     *
     *
     * <p>- `indoor wooden table` 场景下可采用的负向提示词为：</p>
     *
     * <p>	- `top view, empty background, extra connection, wheel, stand, lowres, ugly, bad anatomy, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `flower and leaves`场景下可采用的负向提示词为：</p>
     *
     * <p>	- `top view, empty background, extra connection, wheel, stand, lowres, ugly, bad anatomy, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `white marble table`场景下可采用的负向提示词为：</p>
     *
     * <p>	- `top view, empty background, extra connection, wheel, stand, lowres, ugly, bad anatomy, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `outdoor snow scene`场景下可采用的负向提示词为：</p>
     *
     * <p>	- `op view, empty background, extra connection, wheel, stand, lowres, ugly, bad anatomy, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `supermarket show scene`场景下可采用的负向提示词为：</p>
     *
     * <p>	- `top view, float things, extra connection, adjunct, appendages, stand, bracket, bad anatomy, text, word, grid, brown, grey, bubble, high saturation, sunlight, sun, stripe, spot, empty background, wheel, lowres, ugly, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `food in kitchen`场景下可采用的负向提示词为</p>
     *
     * <p>	- `top view, float things, extra connection, adjunct, appendages, stand, bracket, bad anatomy, text, word, grid, brown, grey, bubble, high saturation, sunlight, sun, stripe, spot, empty background, wheel, lowres, ugly, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `sports style`场景下可采用的负向提示词为：</p>
     *
     * <p>	- `top view, float things, extra connection, adjunct, appendages, stand, bracket, bad anatomy, text, word, grid, brown, grey, bubble, high saturation, sunlight, sun, stripe, spot, empty background, wheel, lowres, ugly, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     *
     * <p>- `modern room`场景下可采用的负向提示词为：</p>
     *
     * <p>	- `top view, float things, extra connection, adjunct, appendages, stand, bracket, bad anatomy, text, word, grid, brown, grey, bubble, high saturation, sunlight, sun, stripe, spot, empty background, wheel, lowres, ugly, bad hands, cropped, worst quality, baby, body, human, brand, bad face`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NegativePrompt")
    private String negativePrompt;

    /**
     * <p>输入到 AIGC 模型的正向提示词，提示词和 `Scene` 二选一必填。两者均存在时，以 `Scene` 为准。当前仅支持英文，最多不超过 300 个字母。</p>
     *
     *
     *
     * <p>- `indoor wooden table` 场景下可采用的正向提示词为：</p>
     *
     * <p>	- `best quality, front view, standing on a wooden table close to window, some plants in the background, bright sunlight, product photography`</p>
     *
     * <p>- `flower and leaves`场景下可采用的正向提示词为：</p>
     *
     * <p>	- `best quality, front view, standing on a circular platform, surrounded by flowers and leaves, sunlight from the right, product photography`</p>
     *
     * <p>- `white marble table`场景下可采用的正向提示词为：</p>
     *
     * <p>	- `best quality, front view, standing on a white marble table in a living room, shallow depth of field, sunlight, shadows,  product photography`</p>
     *
     * <p>- `outdoor snow scene`场景下可采用的正向提示词为：</p>
     *
     * <p>	- `best quality, front view, standing on a pile of snow outdoors, with sky and mountains in the background, shallow depth of field,  product photography`</p>
     *
     * <p>- `supermarket show scene`场景下可采用的正向提示词为：</p>
     *
     * <p>	- `on a empty white table, kitchen, close to window, bright background, background blur, bright light, soft lighting, high quality`</p>
     *
     * <p>- `food in kitchen`场景下可采用的正向提示词为</p>
     *
     * <p>	- `on a empty table,in the kitchen,product picture, bright background, background blur, bright light, soft lighting, high quality`</p>
     *
     * <p>- `sports style`场景下可采用的正向提示词为：</p>
     *
     * <p>	- `in a stadium, stadium in the background, sports style, product picture , bright light, soft lighting, high quality`</p>
     *
     * <p>- `modern room`场景下可采用的正向提示词为：</p>
     *
     * <p>	- `in a modern room, fashion style, soft light, high resolution`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PositivePrompt")
    private String positivePrompt;

    /**
     * <p>商品比例，即商品图的长宽与 `OutputSize` 指定的结果图长宽的比值上限。默认值为 0.6，取值范围为 (0,1)。取值越小，则商品图在生成的结果图中所占的大小越小。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductRatio")
    private Double productRatio;

    /**
     * <p>同时指定结果图长和宽的值，单位为 px。取值范围为 [512,1024]。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>结果图是指定`BatchSize`张长宽比为 1:1 的方图。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputSize")
    private Integer outputSize;

    /**
     * <p>是否使用从商品图中提取的描述，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：（默认）提取原图中商品的描述，和`PositivePrompt`共同作为输入到 AIGC 模型的正向提示词。</p>
     *
     * <p>	</p>
     *
     * <p>- `false`：不使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseCaption")
    private Boolean useCaption;

    /**
     * <p>是否返回最高分生成图及其得分，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是，只返回最高分生成图及其得分。</p>
     *
     * <p>	</p>
     *
     * <p>- `false`：（默认）否，返回所有生成图及其得分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReturnTop1")
    private Boolean returnTop1;

    /**
     * <p>设置商品放置的安全区中心坐标和宽高。取值需大于等于 `-1`，设为默认值 `-1` 时，商品自动居中，安全区为全图；否则需同时指定区安全区四个参数的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CX")
    private Integer cX;

    /**
     * <p>设置商品放置的安全区中心坐标和宽高。取值需大于等于 `-1`，设为默认值 `-1` 时，商品自动居中，安全区为全图；否则需同时指定区安全区四个参数的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CY")
    private Integer cY;

    /**
     * <p>设置商品放置的安全区中心坐标和宽高。取值需大于等于 `-1`，设为默认值 `-1` 时，商品自动居中，安全区为全图；否则需同时指定区安全区四个参数的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SafeH")
    private Integer safeH;

    /**
     * <p>设置商品放置的安全区中心坐标和宽高。取值需大于等于 `-1`，设为默认值 `-1` 时，商品自动居中，安全区为全图；否则需同时指定区安全区四个参数的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SafeW")
    private Integer safeW;

    /**
     * <p>保留字段，用于传递商品 ID，类目 ID 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private String extra;

    /**
     * <p>根据所选场景生成结果图，场景支持以下选项：</p>
     *
     *
     *
     * <p>- `indoor wooden table`：室内木桌场景</p>
     *
     * <p>	</p>
     *
     * <p>- `flower and leaves`：鲜花绿植场景</p>
     *
     * <p>	</p>
     *
     * <p>- `white marble table`：白色大理石场景</p>
     *
     * <p>	</p>
     *
     * <p>- `outdoor snow scene`：室外雪景场景</p>
     *
     * <p>	</p>
     *
     * <p>- `supermarket show scene`：超市小件商品</p>
     *
     * <p>	</p>
     *
     * <p>- `food in kitchen`：食品厨房场景</p>
     *
     * <p>	</p>
     *
     * <p>- `sports style`：运动场景</p>
     *
     * <p>	</p>
     *
     * <p>- `modern room`：现代室内</p>
     *
     *
     *
     * <p>提示词和 `Scene` 二选一必填，两者均存在时，以 `Scene` 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Scene")
    private String scene;

    /**
     * <p>卖点图配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellingPointConfig")
    private GetProductAIGCResultBodySellingPointConfig sellingPointConfig;

    /**
     * <p>智能生成的结果图是否仅生成场景图（仅包含商品主体，不采用文字卖点），取值如下所示：</p>
     *
     * <p>- `true`：（默认）是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BackgroundOnly")
    private Boolean backgroundOnly;

    /**
     * <p>是否返回场景图，取值如下所示：</p>
     *
     * <p>- `true`：（默认）是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReturnBackgroundImage")
    private Boolean returnBackgroundImage;

    /**
     * <p>场景图输出高度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputHeight")
    private Long outputHeight;

    /**
     * <p>场景图输出宽度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputWidth")
    private Long outputWidth;

    /**
     * <p>使用默认的背景图</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseDefaultBg")
    private Boolean useDefaultBg;

    /**
     * <p>Lora 配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LoraConfig")
    private String loraConfig;

    /**
     * <p>商品比例</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductRatios")
    private List<List<Double>> productRatios;

    /**
     * <p>打分策略规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StrategyRules")
    private Map<String, Object> strategyRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
