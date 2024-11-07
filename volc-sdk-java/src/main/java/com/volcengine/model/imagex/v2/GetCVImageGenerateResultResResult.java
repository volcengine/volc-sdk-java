package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetCVImageGenerateResultResResult
 */
@lombok.Data
public final class GetCVImageGenerateResultResResult  {

    /**
     * <p>根据指定的[通用 XL pro-图生图](https://www.volcengine.com/docs/6791/1330203)模型接口信息，接收的该接口响应的 JSON 数据。例如：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "code": 10000,</p>
     *
     * <p>    "data": {</p>
     *
     * <p>        "algorithm_base_resp": {</p>
     *
     * <p>            "status_code": 0,</p>
     *
     * <p>            "status_message": "Success"</p>
     *
     * <p>        },</p>
     *
     * <p>        "binary_data_base64": [],</p>
     *
     * <p>        "comfyui_cost": 11,</p>
     *
     * <p>        "controlnet_args": [</p>
     *
     * <p>            {</p>
     *
     * <p>                "binary_data_index": 0,</p>
     *
     * <p>                "strength": 0.4,</p>
     *
     * <p>                "type": "canny"</p>
     *
     * <p>            }</p>
     *
     * <p>        ],</p>
     *
     * <p>        "controlnet_args.canny.binary_data_index": 0,</p>
     *
     * <p>        "controlnet_args.canny.strength": 0.4,</p>
     *
     * <p>        "controlnet_args.depth.binary_data_index": 0,</p>
     *
     * <p>        "controlnet_args.depth.strength": 0,</p>
     *
     * <p>        "controlnet_args.pose.binary_data_index": 0,</p>
     *
     * <p>        "controlnet_args.pose.strength": 0,</p>
     *
     * <p>        "custom_prompt": "美女",</p>
     *
     * <p>        "ddim_step": 20,</p>
     *
     * <p>        "etta_args": {</p>
     *
     * <p>            "binary_data_index": 0</p>
     *
     * <p>        },</p>
     *
     * <p>        "etta_args.binary_data_index": 0,</p>
     *
     * <p>        "height": 1024,</p>
     *
     * <p>        "image_urls": [</p>
     *
     * <p>            "https://xxx",</p>
     *
     * <p>            "https://xxx"</p>
     *
     * <p>        ],</p>
     *
     * <p>        "logo_info": {</p>
     *
     * <p>            "add_logo": true,</p>
     *
     * <p>            "language": 0,</p>
     *
     * <p>            "opacity": 1,</p>
     *
     * <p>            "position": 2</p>
     *
     * <p>        },</p>
     *
     * <p>        "multi_pipeline_select_key": "t2i",</p>
     *
     * <p>        "prompt": "beautiful woman",</p>
     *
     * <p>        "prompt_translated": "beautiful woman",</p>
     *
     * <p>        "request_id": "8bcd844f913c89717d474d0af05f6bb96e0f4f2d409a379f84349a8952a92121",</p>
     *
     * <p>        "return_url": true,</p>
     *
     * <p>        "scale": 7,</p>
     *
     * <p>        "seed": -1,</p>
     *
     * <p>        "style_reference_args": {</p>
     *
     * <p>            "binary_data_index": 0,</p>
     *
     * <p>            "id_weight": 0.2,</p>
     *
     * <p>            "style_weight": 0</p>
     *
     * <p>        },</p>
     *
     * <p>        "style_reference_args.binary_data_index": 0,</p>
     *
     * <p>        "style_reference_args.id_weight": 0.2,</p>
     *
     * <p>        "style_reference_args.style_weight": 0,</p>
     *
     * <p>        "width": 1024</p>
     *
     * <p>    },</p>
     *
     * <p>    "message": "Success",</p>
     *
     * <p>    "request_id": "20240809145732F1B86B6E94464D05716A",</p>
     *
     * <p>    "status": 10000,</p>
     *
     * <p>    "time_elapsed": "12.696326169s"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RespJson")
    private Map<String, Object> respJson;

    /**
     * <p>最终上传至 veImageX 服务的结果图存储 URI，数量为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrls")
    private List<String> imageUrls;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
