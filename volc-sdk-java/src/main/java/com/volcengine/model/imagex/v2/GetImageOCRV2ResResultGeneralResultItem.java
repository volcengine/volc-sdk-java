package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageOCRV2ResResultGeneralResultItem
 */
@lombok.Data
public final class GetImageOCRV2ResResultGeneralResultItem  {

    /**
     * <p>识别的通用文本信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>文本置信度。识别出的内容可信程度，值越大内容越准确。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Confidence")
    private String confidence;

    /**
     * <p>文本块的坐标位置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Location")
    private List<List<Integer>> location;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
