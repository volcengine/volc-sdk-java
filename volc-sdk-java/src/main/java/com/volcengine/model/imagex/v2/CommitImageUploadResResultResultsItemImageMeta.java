package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CommitImageUploadResResultResultsItemImageMeta
 */
@lombok.Data
public final class CommitImageUploadResResultResultsItemImageMeta  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Field75")
    private Integer field75;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Uri")
    private String uri;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Md5")
    private String md5;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
