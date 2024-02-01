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
     * <p>图片上传结果。</p>
     *
     * <p>* 返回值为 2000，表示上传成功；</p>
     *
     * <p>* 返回值为 2001，表示上传失败。</p>
     *
     * <p>:::tip</p>
     *
     * <p>需要传 SuccessOids 才会返回值。</p>
     *
     * <p>:::</p>
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
