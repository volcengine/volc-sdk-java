package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageFontsResResult
 */
@lombok.Data
public final class GetImageFontsResResult  {

    /**
     * <p>字体列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Fonts")
    private List<GetImageFontsResResultFontsItem> fonts;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
