package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetCVTextGenerateImageResResult
 */
@lombok.Data
public final class GetCVTextGenerateImageResResult  {

    /**
     * <p>根据指定的文生图模型接口信息，接收的该接口响应的 JSON 数据。</p>
     *
     *
     *
     * <p>例如，使用[通用 2.0S-文生图异步](https://www.volcengine.com/docs/6791/1347773)，则 RespJson 接收到的相应信息为：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "code": 10000,</p>
     *
     * <p>    "data": {</p>
     *
     * <p>        "task_id": "7418048504813240370"</p>
     *
     * <p>    },</p>
     *
     * <p>    "message": "Success",</p>
     *
     * <p>    "request_id": "2024092411365866C579D2A96A35DA62A9",</p>
     *
     * <p>    "status": 10000,</p>
     *
     * <p>    "time_elapsed": "23.099216ms"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RespJson")
    private Map<String, Object> respJson;

    /**
     * <p>最终上传至 veImageX 服务的结果图访问 URL，数量为 1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrls")
    private List<String> imageUrls;

    /**
     * <p>存储URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUris")
    private List<String> storeUris;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
