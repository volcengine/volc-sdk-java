package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * BatchImageAuditResResultOutputsItem
 */
@lombok.Data
public final class BatchImageAuditResResultOutputsItem  {

    /**
     * <p>建议您根据实际业务情况，将该参数作为可区分审核图片 `ImageUri` 的自定义标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DataId")
    private String dataId;

    /**
     * <p>图片的公网可访问 URL，用于指定需要审核的图片资源地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>图片审核的建议结果，表示系统对图片内容的审核意见。支持的取值如下所示。</p>
     *
     * <p>- `pass`：审核通过；</p>
     *
     * <p>- `block`：审核不通过；</p>
     *
     * <p>- `review`：需要人工复核。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Advice")
    private String advice;

    /**
     * <p>图片内容的一级审核标签，用于标识图片内容的主要分类。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Label")
    private List<String> label;

    /**
     * <p>图片内容的二级审核标签，用于进一步细化 `Label` 的分类，提供更具体的审核结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SubLabel")
    private List<String> subLabel;

    /**
     * <p>审核结果，取值如下所示：</p>
     *
     *
     *
     * <p>- `problem`：问题图片</p>
     *
     * <p>- `frozen`：冻结图片</p>
     *
     * <p>- `normal`：正常图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageType")
    private String imageType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
