package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * GetCVAnimeGenerateImageResResult
 */
@lombok.Data
public final class GetCVAnimeGenerateImageResResult  {

    /**
     * <p>根据指定的文生图模型接口信息，接收的该接口响应的 JSON 数据。</p>
     *
     *
     *
     * <p>例如，使用[动漫 1.3.X-文生图/图生图](https://www.volcengine.com/docs/6791/1213131)，则 RespJson 接收到的相应信息为：</p>
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>    "code":10000,</p>
     *
     * <p>    "data":{</p>
     *
     * <p>        "binary_data_base64":["xxx"]</p>
     *
     * <p>    },</p>
     *
     * <p>    "message":"Success",</p>
     *
     * <p>    "request_id":"20220926182941010212157201024017C6",</p>
     *
     * <p>    "status":10000,</p>
     *
     * <p>    "time_elapsed":"456.790505ms"</p>
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
