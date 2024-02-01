package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageServiceResResultVodSpace
 */
@lombok.Data
public final class GetImageServiceResResultVodSpace  {

    /**
     * <p>空间名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SpaceName")
    private String spaceName;

    /**
     * <p>空间所在地区</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>底层存储名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
