package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetComprehensiveEnhanceImageResResult
 */
@lombok.Data
public final class GetComprehensiveEnhanceImageResResult  {

    /**
     * <p>结果图 URI。您可使用结果图 URI（即 `ResUri`）[拼接完整访问 URL](https://www.volcengine.com/docs/508/105405#%E9%A2%84%E8%A7%88%E8%BF%94%E5%9B%9E%E7%9A%84%E7%BB%93%E6%9E%9C%E5%9B%BE) 后，在浏览器查看图像增强效果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResUri")
    private String resUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
