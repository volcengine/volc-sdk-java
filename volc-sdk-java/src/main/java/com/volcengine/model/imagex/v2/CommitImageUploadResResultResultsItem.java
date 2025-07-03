package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CommitImageUploadResResultResultsItem
 */
@lombok.Data
public final class CommitImageUploadResResultResultsItem  {

    /**
     * <p>源图片的 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Uri")
    private String uri;

    /**
     * <p>上传结果。</p>
     *
     * <p>- 传入 SuccessOids 时，无论上传图片/非图片，成功返回 2000，失败返回 2001；</p>
     *
     * <p>- 未传入 SuccessOids 时，对于非图片返回 0；对于图片，成功返回 2000，失败返回 2001。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UriStatus")
    private Integer uriStatus;

    /**
     * <p>加密结果。</p>
     *
     * <p>:::tip</p>
     *
     * <p>指定了 Encryption Function 时有值 。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Encryption")
    private CommitImageUploadResResultResultsItemEncryption encryption;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageMeta")
    private CommitImageUploadResResultResultsItemImageMeta imageMeta;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
