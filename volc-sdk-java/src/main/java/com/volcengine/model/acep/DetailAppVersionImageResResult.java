package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailAppVersionImageResResult
 */
@lombok.Data
public final class DetailAppVersionImageResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVersionId")
    private String appVersionId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVersionImageId")
    private String appVersionImageId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageMD5")
    private String imageMD5;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PackageName")
    private String packageName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VersionCode")
    private Integer versionCode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompressFormat")
    private Integer compressFormat;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireAt")
    private Long expireAt;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BuildTaskId")
    private String buildTaskId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BuildJobId")
    private String buildJobId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BuildPodId")
    private String buildPodId;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
