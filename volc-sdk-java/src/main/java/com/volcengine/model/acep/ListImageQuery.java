package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListImageQuery
 */
@lombok.Data
public final class ListImageQuery  {

    /**
     * <p>火山引擎账号 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>镜像 ID。可以指定单个需要查询的镜像。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>镜像 ID 列表，可以指定多个需要查询的镜像，以英文逗号","分割。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageIdList")
    private String imageIdList;

    /**
     * <p>镜像名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageName")
    private String imageName;

    /**
     * <p>镜像版本，包含以下取值：</p>
     *
     * <p>- 10：AOSP 10；</p>
     *
     * <p>- 11：AOSP 11。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AospVersion")
    private String aospVersion;

    /**
     * <p>是否查找公共镜像，包含以下取值：</p>
     *
     * <p>- true：查找公共镜像；</p>
     *
     * <p>- false：（默认值）用户自定义镜像。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsPublic")
    private Boolean isPublic;

    /**
     * <p>镜像状态，包含以下取值：</p>
     *
     * <p>- 0：未知；</p>
     *
     * <p>- 1：导入中，待构建；</p>
     *
     * <p>- 2：构建中；</p>
     *
     * <p>- 11：构建完成；</p>
     *
     * <p>- -1：构建失败。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageStatus")
    private Integer imageStatus;

    /**
     * <p>分页偏移量，默认值为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小，默认值为 10，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    /**
     * <p>是否查询未发布的公共镜像，包含以下取值：</p>
     *
     * <p>- true：是，此时需要提供准确的 ImageId；</p>
     *
     * <p>- false：（默认值）否，只查询已发布的公共镜像</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpandScope")
    private Boolean expandScope;

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
