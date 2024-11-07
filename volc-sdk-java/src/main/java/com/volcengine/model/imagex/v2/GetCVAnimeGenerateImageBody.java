package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetCVAnimeGenerateImageBody
 */
@lombok.Data
public final class GetCVAnimeGenerateImageBody  {

    /**
     * <p>服务下绑定的域名，域名状态需正常可用。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取绑定的域名信息。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取域名，具体请参考[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>服务下创建的图片处理模板名称，指定后，将按照模板中的处理配置对豆包大模型生成的图片进行图片处理。</p>
     *
     *
     *
     * <p>您可在 veImageX 控制台的处理配置页面，参考[新建模板](https://www.volcengine.com/docs/508/8087)配置模板并获取模版名称，例如 `tplv-f0****5k-test`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Template")
    private String template;

    /**
     * <p>指定输出图片的文件名，输入限制如下所示：</p>
     *
     * <p>- 数组长度为 1，若指定多个文件名，仅第一个取值生效。</p>
     *
     * <p>- 不支持空格。</p>
     *
     * <p>- 不支持以/开头或结尾，不支持/连续出现，最大长度限制为 180 个字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Outputs")
    private List<String> outputs;

    /**
     * <p>是否覆盖服务下同名文件，取值如下所示：</p>
     *
     * <p>- `false`：（默认）不覆盖</p>
     *
     * <p>- `true`：覆盖</p>
     *
     * <p>:::tip</p>
     *
     * <p>请确保您已开启[重名覆盖上传](https://www.volcengine.com/docs/508/1119912)功能，否则，此处配置无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Overwrite")
    private Boolean overwrite;

    /**
     * <p>[文生图系列模型](#使用说明)的接口的请求 JSON 字符串。</p>
     *
     *
     *
     * <p>例如，使用[动漫 1.3.X-文生图/图生图](https://www.volcengine.com/docs/6791/1213131)，则 `ReqJson` 需要取值为：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "req_key": "high_aes",</p>
     *
     * <p>    "prompt": "千军万马",</p>
     *
     * <p>    "model_version": "anime_v1.3",</p>
     *
     * <p>    "binary_data_base64": [""],</p>
     *
     * <p>    "strength": 0.7,</p>
     *
     * <p>    "seed": -1,</p>
     *
     * <p>    "scale": 7,</p>
     *
     * <p>    "ddim_steps": 20,</p>
     *
     * <p>    "width": 1024,</p>
     *
     * <p>    "height": 1024,</p>
     *
     * <p>    "return_url": False,</p>
     *
     * <p>    "logo_info": {</p>
     *
     * <p>        "add_logo": False,</p>
     *
     * <p>        "position": 0,</p>
     *
     * <p>        "language": 0,</p>
     *
     * <p>        "logo_text_content": "这里是明水印内容"</p>
     *
     * <p>    }</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReqJson")
    private Map<String, Object> reqJson;

    /**
     * <p>[文生图系列模型](#使用说明)的接口 Action 名称。</p>
     *
     *
     *
     * <p>例如，使用[动漫 1.3.X-文生图/图生图](https://www.volcengine.com/docs/6791/1213131)，则 `ModelAction` 需要取值为 `CVProcess`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModelAction")
    private String modelAction;

    /**
     * <p>[文生图系列模型](#使用说明)的接口 Version 名称。</p>
     *
     *
     *
     * <p>例如，使用[动漫 1.3.X-文生图/图生图](https://www.volcengine.com/docs/6791/1213131)，则 `ModelVersion` 需要取值为 `2022-08-31`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModelVersion")
    private String modelVersion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
