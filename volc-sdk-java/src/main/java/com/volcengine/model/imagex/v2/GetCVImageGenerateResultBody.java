package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetCVImageGenerateResultBody
 */
@lombok.Data
public final class GetCVImageGenerateResultBody  {

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
     * <p>- `true`：覆盖</p>
     *
     * <p>- `false`：（默认）不覆盖</p>
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
     * <p>[通用 XL pro-图生图](https://www.volcengine.com/docs/6791/1330203)模型接口的请求 JSON 字符串。例如：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "req_key": "i2i_xl_sft",</p>
     *
     * <p>    "image_urls": [</p>
     *
     * <p>        "https://xxx"</p>
     *
     * <p>    ],</p>
     *
     * <p>    "prompt": "美女",</p>
     *
     * <p>    "seed": -1,</p>
     *
     * <p>    "ddim_steps": 20,</p>
     *
     * <p>    "scale": 7.0,</p>
     *
     * <p>    "controlnet_args": [</p>
     *
     * <p>        {</p>
     *
     * <p>            "type": "canny",</p>
     *
     * <p>            "strength": 0.4,</p>
     *
     * <p>            "binary_data_index": 0</p>
     *
     * <p>        }</p>
     *
     * <p>    ],</p>
     *
     * <p>    "style_reference_args": {</p>
     *
     * <p>        "id_weight": 0.2,</p>
     *
     * <p>        "style_weight": 0.0,</p>
     *
     * <p>        "binary_data_index": 0</p>
     *
     * <p>    },</p>
     *
     * <p>    "etta_args": {</p>
     *
     * <p>        "binary_data_index": 0</p>
     *
     * <p>    },</p>
     *
     * <p>    "return_url": true,</p>
     *
     * <p>    "logo_info": {</p>
     *
     * <p>        "add_logo": true,</p>
     *
     * <p>        "position": 2,</p>
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
     * <p>[通用 XL pro-图生图](https://www.volcengine.com/docs/6791/1330203)模型接口的 Action 名称，即 `Img2ImgXLSft`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModelAction")
    private String modelAction;

    /**
     * <p>[通用 XL pro-图生图](https://www.volcengine.com/docs/6791/1330203)模型接口的 Version 名称，即 `2022-08-31`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ModelVersion")
    private String modelVersion;

    /**
     * <p>基于该图片智能生图，支持传入该服务下的图片存储 URI 或公网访问 URL。图片输入限制如下所示：</p>
     *
     * <p>1. 图片格式：JPG(JPEG)、PNG、BMP 等常见格式，建议使用 JPG 格式。</p>
     *
     * <p>2. 图片要求：图片体积小于 5MB，分辨率小于 4096\*4096，宽高均尽可能在 1024 左右。宽高比例不建议过于极端，否则出图效果不佳，且延迟过长的概率也会显著增加。输出图片宽高与输入图一致。</p>
     *
     * <p>:::tip</p>
     *
     * <p>指定 `ImageUrl` 后，`ReqJson` 中指定的图片地址无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
