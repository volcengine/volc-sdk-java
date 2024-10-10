package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * ResultImage
 */
@lombok.Data
public final class ResultImage  {

    /**
     * <p>镜像 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>构建任务创建时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateAt")
    private Long createAt;

    /**
     * <p>构建任务更新时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateAt")
    private Long updateAt;

    /**
     * <p>镜像名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageName")
    private String imageName;

    /**
     * <p>镜像大小，单位 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageSize")
    private Long imageSize;

    /**
     * <p>镜像版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AospVersion")
    private String aospVersion;

    /**
     * <p>镜像描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageRemark")
    private String imageRemark;

    /**
     * <p>镜像状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageStatus")
    private Integer imageStatus;

    /**
     * <p>镜像预热状态，包含以下取值：</p>
     *
     * <p>- 0：非预热镜像；</p>
     *
     * <p>- 1：预热中；</p>
     *
     * <p>- 2：预热成功；</p>
     *
     * <p>- 3：预热失败；</p>
     *
     * <p>- 4：等待预热中。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreheatStatus")
    private Integer preheatStatus;

    /**
     * <p>镜像状态描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageStatusStr")
    private String imageStatusStr;

    /**
     * <p>镜像版本名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AospVersionName")
    private String aospVersionName;

    /**
     * <p>镜像下载地址。</p>
     *
     * <p>如需获取自定义镜像文件下载地址，请先联系技术支持团队获取权限，获取到权限后需重新构建镜像，方可返回该字段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageDownloadUrl")
    private String imageDownloadUrl;

    /**
     * <p>镜像对应的适配架构类型。包含以下取值：</p>
     *
     * <p>- ARM_SoC：ARM 板卡可用；</p>
     *
     * <p>- ARM_Server：ARMServer 资源可用；</p>
     *
     * <p>- General：通用类型，可适配多个类型的资源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageResourceType")
    private String imageResourceType;

    /**
     * <p>镜像上传状态。</p>
     *
     * <p>如需获取自定义镜像上传状态，请先联系技术支持团队获取权限，获取到权限后需重新构建镜像，方可返回该字段。</p>
     *
     * <p>包含以下取值：</p>
     *
     * <p>- 0：不需要上传；</p>
     *
     * <p>- 1：等待上传，队列中；</p>
     *
     * <p>- 2：上传中；</p>
     *
     * <p>- 11：上传完成；</p>
     *
     * <p>- -1：上传失败；</p>
     *
     * <p>- 100：等待构建完成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadImageStatus")
    private Integer uploadImageStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
