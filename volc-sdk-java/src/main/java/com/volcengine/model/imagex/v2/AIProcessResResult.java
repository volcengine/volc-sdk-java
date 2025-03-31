package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AIProcessResResult
 */
@lombok.Data
public final class AIProcessResResult  {

    /**
     * <p>AI 图像处理结果，是 JSON 压缩并转义后的字符串。参看 [AI 图像处理模板](https://www.volcengine.com/docs/508/1515840)页面获取模板 ID 和参数信息，根据具体的工作流的说明进行解析。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Output")
    private String output;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
