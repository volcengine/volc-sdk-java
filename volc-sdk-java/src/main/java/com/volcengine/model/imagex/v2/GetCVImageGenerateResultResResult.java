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
     * <p>根据指定的[通用 XL pro-图生图](https://www.volcengine.com/docs/6791/1330203)模型接口信息，接收的该接口响应的 JSON 数据。</p>
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
