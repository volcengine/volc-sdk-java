package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageUploadFilesResResult
 */
@lombok.Data
public final class UpdateImageUploadFilesResResult  {

    /**
     * <p>操作成功的图片 URL 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrls")
    private List<String> imageUrls;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailUrls")
    private List<String> failUrls;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
