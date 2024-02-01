package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageOCRV2ResResultLicenseResult
 */
@lombok.Data
public final class GetImageOCRV2ResResultLicenseResult  {

    /**
     * <p>识别出的文本块坐标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Location")
    private List<Integer> location;

    /**
     * <p>识别的营业执照文本内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
