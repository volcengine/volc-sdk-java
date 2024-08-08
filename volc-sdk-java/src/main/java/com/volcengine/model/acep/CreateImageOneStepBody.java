package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageOneStepBody
 */
@lombok.Data
public final class CreateImageOneStepBody  {

    /**
     * <p>云手机业务ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>镜像 ID，作为构建自定义镜像的基线或基准镜像。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageId")
    private String imageId;

    /**
     * <p>镜像名称，由用户自定义，用于业务标识。</p>
     *
     * <p>支持英文、中文字符、数字和下划线，需以英文或中文开头，长度不超过 128 个字符。</p>
     *
     * <p>如不指定，则使用默认名称，格式为 “公共镜像 ID+AOSP 镜像版本+账号 ID+自定义镜像”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageName")
    private String imageName;

    /**
     * <p>镜像描述信息，由用户按需添加镜像备注说明，便于业务识别。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageAnnotation")
    private String imageAnnotation;

    /**
     * <p>需要内置的应用或文件的下载地址；内置的文件需按照固定格式提供整体压缩包文件，文件名需为 `file.zip`。详请参考[预置应用或文件上传说明](https://www.volcengine.com/docs/6394/1181814#%E9%A2%84%E7%BD%AE%E5%BA%94%E7%94%A8%E6%88%96%E6%96%87%E4%BB%B6%E4%B8%8A%E4%BC%A0%E8%AF%B4%E6%98%8E)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileUrl")
    private String fileUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
