package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSuperResolutionResultResResult
 */
@lombok.Data
public final class GetImageSuperResolutionResultResResult  {

    /**
     * <p>结果图 URI。您可使用结果图 URI（即 `ResUri`）[拼接完整访问 URL](https://www.volcengine.com/docs/508/105405#预览返回的结果图) 后，在浏览器查看图像超分辨率效果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
