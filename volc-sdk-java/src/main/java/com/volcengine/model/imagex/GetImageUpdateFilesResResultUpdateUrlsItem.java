package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageUpdateFilesResResultUpdateUrlsItem
 */
@lombok.Data
public final class GetImageUpdateFilesResResultUpdateUrlsItem  {

    /**
     * <p>图片 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    /**
     * <p>URL 更新时间，即图像更新时的服务器当地时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private String updateAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
